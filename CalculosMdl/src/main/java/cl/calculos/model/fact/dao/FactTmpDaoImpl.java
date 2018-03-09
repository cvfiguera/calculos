package cl.calculos.model.fact.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cl.calculos.model.fact.common.AdjTmp;
import cl.calculos.model.fact.common.DetRbdTmp;
import cl.calculos.model.fact.common.FactTmp;
import cl.calculos.model.fact.common.InstTmp;

@Repository
public class FactTmpDaoImpl extends HibernateFact implements FactTmpDao {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addFactTmp(List<FactTmp> facts) {
		this.addObjectList((List<Object>) (List) facts);		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addInstTmp(List<InstTmp> inst) {
		this.addObjectList((List<Object>) (List) inst);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addAdjInstTmp(List<AdjTmp> adj) {
		this.addObjectList((List<Object>) (List<?>) adj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addDetRbdTmp(List<DetRbdTmp> det) {
		this.addObjectList((List<Object>) (List<?>) det);
	}

	@Override
	public void deleteFactTmp(Integer operadoraId, String anio, String mes) {
		String hql = "Delete FactTmp Where operadoraId = " + operadoraId + " And mes = '" + mes + "' And anio = '" + anio + "'";
		this.deleteObjectHqlUnique(hql);		
	}

	@Override
	public void addFactTmp(FactTmp fact) {
		this.addObject(fact);
		
	}
}
