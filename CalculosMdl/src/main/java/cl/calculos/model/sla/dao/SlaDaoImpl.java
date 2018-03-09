package cl.calculos.model.sla.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.calculos.model.sla.common.Bitacoras;
import cl.calculos.model.sla.common.DetalleDisponibilidad;
import cl.calculos.model.sla.common.DetalleVelocidad;
import cl.calculos.model.sla.common.Feriados;
import cl.calculos.model.sla.common.Prefacturas;
import cl.calculos.model.sla.common.ResumenDisponibilidad;
import cl.calculos.model.sla.common.ResumenVelocidad;
import cl.calculos.model.vo.Parametro;

@Repository
public class SlaDaoImpl extends HibernateSla implements SlaDao {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<ResumenDisponibilidad> getResumenDispo(Integer rbd, Integer archivoId) {
		String hql = "from ResumenDisponibilidad rd where rd.archivos.archivoControlId = " + archivoId
				+ " and rd.rbdNu = " + rbd;
		return (List<ResumenDisponibilidad>) (List) getObjetHqlList(new ResumenDisponibilidad(), hql);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<ResumenVelocidad> getResumenVel(Integer rbd, Integer archivoId) {
		String hql = "from ResumenVelocidad rv where rv.archivos.archivoControlId = " + archivoId
				+ " and rv.rbdNu = " + rbd;
		return (List<ResumenVelocidad>) (List) getObjetHqlList(new ResumenVelocidad(), hql);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<DetalleDisponibilidad> getDetalleDispo(Integer rbd, Integer archivoId, Date fechaIni, Date fechaFin) {
		String hql = "from DetalleDisponibilidad where archivos.archivoControlId =:archivo "
				+ " and rbdNu =:rbd and fechaHoraMuestraFe >= :fechai and fechaHoraMuestraFe <= :fechaf order by fechaHoraMuestraFe asc";
		List<Parametro> params = new ArrayList<Parametro>();
		params.add(new Parametro("rbd", rbd));
		params.add(new Parametro("archivo", archivoId));
		params.add(new Parametro("fechai", fechaIni));
		params.add(new Parametro("fechaf", fechaFin));
		return (List<DetalleDisponibilidad>) (List) getObjectListHqlWithParam(new DetalleDisponibilidad(), hql, params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<DetalleVelocidad> getDetalleVelBajada(Integer rbd, Integer archivoId, Date fechaIni, Date fechaFin) {
			String hql = "from DetalleVelocidad where archivos.archivoControlId =:archivo "
					+ " and rbdNu =:rbd and fechaHoraMuestraFe >= :fechai and fechaHoraMuestraFe <= :fechaf and tipoBo = true order by fechaHoraMuestraFe asc";
			List<Parametro> params = new ArrayList<Parametro>();
			params.add(new Parametro("rbd", rbd));
			params.add(new Parametro("archivo", archivoId));
			params.add(new Parametro("fechai", fechaIni));
			params.add(new Parametro("fechaf", fechaFin));
			return (List<DetalleVelocidad>) (List) getObjectListHqlWithParam(new DetalleVelocidad(), hql, params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<DetalleVelocidad> getDetalleVelSubida(Integer rbd, Integer archivoId, Date fechaIni, Date fechaFin) {
		String hql = "from DetalleVelocidad where archivos.archivoControlId =:archivo "
				+ " and rbdNu =:rbd and fechaHoraMuestraFe >= :fechai and fechaHoraMuestraFe <= :fechaf and tipoBo = false order by fechaHoraMuestraFe asc";
		List<Parametro> params = new ArrayList<Parametro>();
		params.add(new Parametro("rbd", rbd));
		params.add(new Parametro("archivo", archivoId));
		params.add(new Parametro("fechai", fechaIni));
		params.add(new Parametro("fechaf", fechaFin));
		return (List<DetalleVelocidad>) (List) getObjectListHqlWithParam(new DetalleVelocidad(), hql, params);
	}

	@Override
	public Prefacturas getPrefactura(Integer rbd, Integer archivoId) {
		String hql = "from Prefacturas p where p.archivos.archivoControlId = " + archivoId
				+ " and p.rbdNu = " + rbd;
		return (Prefacturas) getObjectHqlUnique(new Prefacturas(), hql);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Bitacoras> getBitacoraAprob(Integer rbd, Integer archivoId, Date fecha) {
		String hql = "from Bitacoras b where b.archivos.archivoControlId = :archivo "
				+ " and b.rbdNu = :rbd and b.fechaInicioFe >= :fecha and b.fechaFinFe <= :fecha";
		List<Parametro> params = new ArrayList<Parametro>();
		params.add(new Parametro("rbd", rbd));
		params.add(new Parametro("archivo", archivoId));
		params.add(new Parametro("fecha", fecha));

		return (List<Bitacoras>) (List) getObjectListHqlWithParam(new Bitacoras(), hql, params);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Boolean vieneEnResumenDispo(Integer rbd, Integer archivoId) {
		String hql = "from ResumenDisponibilidad rd where rd.archivos.archivoControlId = " + archivoId
				+ " and rd.rbdNu = " + rbd + " ";
		return (((List<ResumenDisponibilidad>) (List) getObjectHqlFirst(new ResumenDisponibilidad(), hql)).size() > 0) ? true : false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Boolean vieneEnResumenVel(Integer rbd, Integer archivoId) {
		String hql = "from ResumenVelocidad rv where rv.archivos.archivoControlId = " + archivoId
				+ " and rv.rbdNu = " + rbd;
		return (((List<ResumenVelocidad>) (List) getObjectHqlFirst(new ResumenVelocidad(), hql)).size() > 0) ? true : false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Boolean tieneBitacoraaprob(Integer rbd, Integer archivoId) {
		String hql = "from Bitacoras b where b.archivos.archivoControlId = " + archivoId
				+ " and b.rbdNu = " + rbd;
		return (((List<Bitacoras>) (List) getObjectHqlFirst(new Bitacoras(), hql)).size() > 0) ? true : false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Boolean vieneEnPrefactura(Integer rbd, Integer archivoId) {
		String hql = "from Prefacturas p where p.archivos.archivoControlId = " + archivoId
				+ " and p.rbdNu = " + rbd;
		return (((List<Prefacturas>) (List) getObjectHqlFirst(new Prefacturas(), hql)).size() > 0) ? true : false;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Feriados> feriados(Date fechaIni, Date fechaFin) {
		
		String hql = "from Feriados f Where f.fecha >= :fechaIni and "
				+ "f.fecha <= :fechaFin order by f.fecha asc";
		List<Parametro> params = new ArrayList<Parametro>();
		params.add(new Parametro("fechaIni", fechaIni));
		params.add(new Parametro("fechaFin", fechaFin));

		return (List<Feriados>) (List) getObjectListHqlWithParam(new Feriados(), hql, params);
	}

	@Override
	public Boolean esFeriado(Date fecha) {
		String hql = "from Feriados f where f.fecha = :fecha ";
		List<Parametro> params = new ArrayList<Parametro>();
		params.add(new Parametro("fecha", fecha));
		return (((Feriados) this.getObjectHqlUniqueParam(new Bitacoras(), hql, params)) != null) ? true : false;
	}	
}
