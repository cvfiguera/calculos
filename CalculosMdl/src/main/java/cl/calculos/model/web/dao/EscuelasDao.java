package cl.calculos.model.web.dao;

import java.util.List;

import cl.calculos.model.vo.ResumenAdjudicacion;
import cl.calculos.model.vo.ResumenInstalacion;
import cl.calculos.model.web.common.EscuelasView;

public interface EscuelasDao {
	
	public List<EscuelasView> getEscuelasByParameters(Integer concurso, Integer operadora);
	
	public List<ResumenInstalacion> getInstalacionesByPeriodo(Integer operadora, String anio, String mes);
	
	public List<ResumenAdjudicacion> getAdjudicacionesByPeriodo(Integer operadora, String anio, String mes);
}
