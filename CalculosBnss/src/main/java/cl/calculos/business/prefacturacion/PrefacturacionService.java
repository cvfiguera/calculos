package cl.calculos.business.prefacturacion;

import java.util.List;

import cl.calculos.business.vo.ArchivoVO;
import cl.calculos.model.fact.common.FactTmp;

public interface PrefacturacionService {
	
	public List<ArchivoVO> getPrefacturasProcesadas(Integer operadora, String year, String month);
	
	public void calcularResumenMes(Integer concurso, Integer operadora, String year, String month);

}
