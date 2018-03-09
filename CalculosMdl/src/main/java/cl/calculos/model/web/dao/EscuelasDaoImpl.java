package cl.calculos.model.web.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.calculos.model.vo.ResumenAdjudicacion;
import cl.calculos.model.vo.ResumenInstalacion;
import cl.calculos.model.web.common.EscuelasView;
import cl.calculos.model.web.common.Instalaciones;

@Repository
public class EscuelasDaoImpl extends HibernateWeb implements EscuelasDao {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<EscuelasView> getEscuelasByParameters(Integer concurso, Integer operadora) {
		String hql = "From EscuelasView e Where e.operadoraId = " + operadora 
				+ " And e.concursoId = " + concurso;
		return (List<EscuelasView>) (List) getObjetHqlList(new EscuelasView(), hql);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<ResumenInstalacion> getInstalacionesByPeriodo(Integer operadora, String anio, String mes) {
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(anio), Integer.parseInt(mes) - 1, 1);
		Date i = c.getTime();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date f = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String hql = "select distinct rbd_id as rbd, concurso_id as concurso, operadora_id as operadora, fecha_alta_servicio_fe as falta, fecha_desintalacion_fe as fbaja, tecnologia_id as tecnologia, precio_instalacion_decimal as precio, "
				+ "velocidad_nacional_nu as vbajada, velocidad_internacional_nu as vsubida, instalacion_excepcion_id as excepcion from web.instalaciones i inner join "
				+ "web.rbd_concursos rc on (i.rbd_concurso_id = rc.rbd_concurso_id), (select rbd_concurso_id, max(fecha_alta_servicio_fe) as fecha "
				+ "from web.instalaciones where operadora_id = " + operadora
				+ " group by rbd_concurso_id) i_max where (i.rbd_concurso_id = i_max.rbd_concurso_id and i.fecha_alta_servicio_fe = i_max.fecha) "
				+ "or (i.fecha_alta_servicio_fe >= '" + sdf.format(i) + "' and i.fecha_alta_servicio_fe <= '" + sdf.format(f) + "') "
				+ "or (i.fecha_desintalacion_fe >= '" + sdf.format(i) + "' and i.fecha_desintalacion_fe <= '" + sdf.format(f) + "') ";
		
				return (List<ResumenInstalacion>) (List) this.getObjectListSql(new ResumenInstalacion(), hql);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<ResumenAdjudicacion> getAdjudicacionesByPeriodo(Integer operadora, String anio, String mes) {
		Calendar c = Calendar.getInstance();
		c.set(Integer.parseInt(anio), Integer.parseInt(mes) - 1, 1);
		Date i = c.getTime();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date f = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String hql = "select distinct rbd_id as rbd, concurso_id as concurso, operadora_id as operadora, tecnologia_id as tecnologia, precio_adjudicacion_nu as precio, velocidad_nacional_nu as vbajada,"
				+ "velocidad_internacional_nu as vsubida, fecha_adjudicacion as fadj, fecha_desadjudicacion as fdsj from web.adjudicaciones a inner join "
				+ "web.rbd_concursos rc on (a.rbd_concurso_id = rc.rbd_concurso_id), (select adjudicaciones.rbd_concurso_id, max(adjudicaciones.fecha_adjudicacion) as fecha "
				+ "from web.adjudicaciones where operadora_id = '" + operadora + "' group by adjudicaciones.rbd_concurso_id) a_max "
				+ "where (a.rbd_concurso_id = a_max.rbd_concurso_id) or (fecha_adjudicacion >= '" + sdf.format(i) + "' and fecha_adjudicacion <= '" + sdf.format(f) + "') "
				+ "or (fecha_desadjudicacion >= '" + sdf.format(i) + "' and fecha_desadjudicacion <= '" + sdf.format(f) + "')";
		
				return (List<ResumenAdjudicacion>) (List) this.getObjectListSql(new ResumenAdjudicacion(), hql);
	}
}
