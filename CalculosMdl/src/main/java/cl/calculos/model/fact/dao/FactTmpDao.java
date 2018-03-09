package cl.calculos.model.fact.dao;

import java.util.List;

import cl.calculos.model.fact.common.AdjTmp;
import cl.calculos.model.fact.common.DetRbdTmp;
import cl.calculos.model.fact.common.FactTmp;
import cl.calculos.model.fact.common.InstTmp;

public interface FactTmpDao {
	
	public void addFactTmp(List<FactTmp> facts);

	public void deleteFactTmp(Integer operadoraId, String anio, String mes);
	
	public void addFactTmp(FactTmp facts);
	
	public void addInstTmp(List<InstTmp> inst);
	
	public void addAdjInstTmp(List<AdjTmp> adj);
	
	public void addDetRbdTmp(List<DetRbdTmp> det);
	
}
