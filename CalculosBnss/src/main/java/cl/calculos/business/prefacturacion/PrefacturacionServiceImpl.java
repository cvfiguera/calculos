package cl.calculos.business.prefacturacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.calculos.business.util.TiposArchivo;
import cl.calculos.business.vo.ArchivoVO;
import cl.calculos.model.control.dao.ArchivoDao;
import cl.calculos.model.fact.common.AdjTmp;
import cl.calculos.model.fact.common.DetRbdTmp;
import cl.calculos.model.fact.common.FactTmp;
import cl.calculos.model.fact.common.InstTmp;
import cl.calculos.model.fact.dao.FactTmpDao;
import cl.calculos.model.sla.common.Bitacoras;
import cl.calculos.model.sla.common.DetalleDisponibilidad;
import cl.calculos.model.sla.common.DetalleVelocidad;
import cl.calculos.model.sla.common.Feriados;
import cl.calculos.model.sla.dao.SlaDao;
import cl.calculos.model.vo.ResumenAdjudicacion;
import cl.calculos.model.vo.ResumenArchivo;
import cl.calculos.model.vo.ResumenInstalacion;
import cl.calculos.model.web.common.EscuelasView;
import cl.calculos.model.web.dao.EscuelasDao;

@Service
public class PrefacturacionServiceImpl implements PrefacturacionService {

	@Autowired
	private ArchivoDao archivoDao;
	@Autowired
	private EscuelasDao escuelasDao;
	@Autowired
	private SlaDao slaDao;
	@Autowired
	private FactTmpDao factTmpDao;
	
	
	@Override
	public List<ArchivoVO> getPrefacturasProcesadas(Integer operadora, String year, String month) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<ResumenArchivo> archivos = archivoDao.getArchivosMes(operadora, year, month);
		List<ArchivoVO> archivosVO = archivos.stream().map(archivo -> 
		new ArchivoVO(archivo.getId(), archivo.getCodtipo(), archivo.getTipo(),
				archivo.getNombre(), archivo.getVersion(), sdf.format(archivo.getFecha()),
				archivo.getCodestado(), archivo.getEstado()))
				.collect(Collectors.toList());
		return archivosVO;
	}

	@Override
	public void calcularResumenMes(Integer concurso, Integer operadora, String year, String month) {
		
		List<ResumenArchivo> archivos = archivoDao.getArchivosMes(operadora, year, month);	
		Integer rDis = 0, rVel = 0, dDispo = 0, dVelSub = 0, dVelBaj = 0, bit = 0, pref = 0;
		for (ResumenArchivo a : archivos) {
			if (a.getCodtipo() == TiposArchivo.RESUMEN_DISPONIBILIDAD.cod()) 
				rDis = a.getId();
			else if (a.getCodtipo() == TiposArchivo.RESUMEN_VELOCIDAD.cod())
				rVel = a.getId();
			else if (a.getCodtipo() == TiposArchivo.BITACORA.cod())
				bit = a.getId();
			else if (a.getCodtipo() == TiposArchivo.PREFACTURA.cod()) 
				pref = a.getId();
			else if (a.getCodtipo() == TiposArchivo.DETALLE_DISPONIBILIDAD.cod())
				dDispo = a.getId();
			else if (a.getCodtipo() == TiposArchivo.DETALLE_VELOCIDAD_BAJADA.cod())
				dVelBaj = a.getId();
			else if (a.getCodtipo() == TiposArchivo.DETALLE_VELOCIDAD_SUBIDA.cod())
				dVelSub = a.getId();
		}
		
		List<EscuelasView> escuelas = escuelasDao.getEscuelasByParameters(concurso, operadora);
		factTmpDao.deleteFactTmp(operadora, year, month);
		
		for(EscuelasView escuela : escuelas) {
			FactTmp fact = new FactTmp(escuela.getRbdId(), escuela.getRbd(), escuela.getOperadoraId(),
					year, month, escuela.getEstadoConectadoId(), escuela.getEstadoAdjudicadoId(),
					escuela.getEstadoMineducId());
	
			fact.setEnResumenDispo(slaDao.vieneEnResumenDispo(escuela.getRbd(), rDis));
			fact.setEnResumenVel(slaDao.vieneEnResumenVel(escuela.getRbd(), rVel));
			fact.setBitacoraAprob(slaDao.tieneBitacoraaprob(escuela.getRbd(), bit));
			fact.setEnPrefactura(slaDao.vieneEnPrefactura(escuela.getRbd(), pref));
		
			factTmpDao.addFactTmp(fact);
			calcularInstalaciones(fact, operadora, year, month);
			calcularDetalleDispo(fact, dDispo, dVelBaj, dVelSub, bit, escuela.getRbdId(), 
					escuela.getRbd(), Integer.parseInt(month), Integer.parseInt(year));
			
		}
	}
	
	private void calcularInstalaciones(FactTmp fact, Integer operadora, String year, String month) {
		
		List<ResumenInstalacion> instalaciones = escuelasDao.getInstalacionesByPeriodo(operadora, year, month);
		List<ResumenAdjudicacion> adjudicaciones = escuelasDao.getAdjudicacionesByPeriodo(operadora, year, month);
		List<InstTmp> inst = instalaciones.stream().map(instalacion -> 
		new InstTmp(fact, instalacion.getRbd(), instalacion.getFalta(), instalacion.getFbaja(),
				instalacion.getPrecio(), instalacion.getVbajada(), instalacion.getVsubida(), 
				instalacion.getConcurso(), instalacion.getOperadora(), instalacion.getTecnologia())).collect(Collectors.toList());
		factTmpDao.addInstTmp(inst);
		List<AdjTmp> adj = adjudicaciones.stream().map(adjudicacion -> new AdjTmp(fact, adjudicacion.getRbd(),
				adjudicacion.getFadj(), adjudicacion.getFdsj(), adjudicacion.getPrecio(),
				adjudicacion.getVbajada(), adjudicacion.getVsubida(), adjudicacion.getConcurso(), 
				adjudicacion.getOperadora(), adjudicacion.getTecnologia())).collect(Collectors.toList());
		factTmpDao.addAdjInstTmp(adj);
	}
	
	private void calcularDetalleDispo(FactTmp fact, Integer dDispo, Integer dVelBaj, Integer dVelSub, Integer bit, Integer rbdId, 
			Integer rbd, Integer mes, Integer anio) {
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdh = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date fecha;
			fecha = sdf.parse(anio + "-" + mes + "-01");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(fecha);
			Date fechaFin = sdf.parse(anio + "-" + mes + "-" + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			List<DetRbdTmp> detalles = new ArrayList<DetRbdTmp>();
			
			for (;fecha.compareTo(fechaFin) <= 0;) {
				int d = calendar.get(Calendar.DAY_OF_WEEK);
				if (d > 1) {
					Boolean feriado = slaDao.esFeriado(fecha);
					if (feriado) {
						detalles.add(new DetRbdTmp(fact, rbdId, null, fecha, null, null,
								null, true, null));
					} else {
						String fechaHoraIni = sdf.format(fecha) + " 00:00:00";
						String fechaHoraFin = sdf.format(fecha) + " 24:00:00";
						
						List<DetalleDisponibilidad> dDispoList  = slaDao.getDetalleDispo(rbd, dDispo, sdh.parse(fechaHoraIni), sdh.parse(fechaHoraFin));
						List<DetalleVelocidad> dVelBajList= slaDao.getDetalleVelBajada(rbd, dVelBaj, sdh.parse(fechaHoraIni), sdh.parse(fechaHoraFin));
						List<DetalleVelocidad> dVelSubList = slaDao.getDetalleVelSubida(rbd, dVelSub, sdh.parse(fechaHoraIni), sdh.parse(fechaHoraFin));
						List<Bitacoras> bitacoraList = slaDao.getBitacoraAprob(rbd, bit, fecha);
						
						for(int i = 0, n = (d==7)?6:10, h = 8; i < n; i++, h++) {
							Calendar c = Calendar.getInstance();
							c.setTime(fecha);
							c.set(Calendar.HOUR, h);
						    c.set(Calendar.MINUTE, 0);
						    c.set(Calendar.SECOND, 0);
							DetRbdTmp detalle = new DetRbdTmp(fact, rbd, i + 1, c.getTime());
							
							if (dDispoList.size()>i) {
								DetalleDisponibilidad dd = dDispoList.get(i);
								c.setTime(dd.getFechaHoraMuestraFe());
								//Si la hora de la muestra es igual, o si es la ultima muestra que puede ser 17 y 18
								if ((c.get(Calendar.HOUR_OF_DAY) == h) || ((i == (n-1)) && (c.get(Calendar.HOUR_OF_DAY) == (h+1)))) {
									detalle.setDispo(dd.getValorMuestraNu());
								}
							}
							
							if (dVelBajList.size()>i) {
								DetalleVelocidad dvb = dVelBajList.get(i);
								c.setTime(dvb.getFechaHoraMuestraFe());
								if ((c.get(Calendar.HOUR_OF_DAY) == h) || ((i == (n-1)) && (c.get(Calendar.HOUR_OF_DAY) == (h+1)))) {
									detalle.setVBajada(dvb.getValorMuestraNu());
								}
							}
							
							if (dVelBajList.size()>i) {
								DetalleVelocidad dvs = dVelSubList.get(i);
								c.setTime(dvs.getFechaHoraMuestraFe());
								if ((c.get(Calendar.HOUR_OF_DAY) == h) || ((i == (n-1)) && (c.get(Calendar.HOUR_OF_DAY) == (h+1)))) {
									detalle.setVSubida(dvs.getValorMuestraNu());
								}
							}
							
							for(Bitacoras b : bitacoraList) {
								c.setTime(b.getHoraInicioTi());
								if ((h >= c.get(Calendar.HOUR_OF_DAY)) || ((i == (n-1)) && (c.get(Calendar.HOUR_OF_DAY) == (h+1)))) {
									c.setTime(b.getFechaFinFe());
									if (h <= c.get(Calendar.HOUR_OF_DAY)) {
										detalle.setBitacora(true);;
									}
								}
							}
							
							detalle.setFeriado(false);
							detalles.add(detalle);
						}
					}
				}
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				fecha = sdf.parse(sdf.format(calendar.getTime()));
			}
			factTmpDao.addDetRbdTmp(detalles);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
