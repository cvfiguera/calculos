package cl.calculos.model.control.dao;

import java.util.List;
import cl.calculos.model.vo.ResumenArchivo;

public interface ArchivoDao {
	
	public List<ResumenArchivo> getArchivosMes(Integer operadora, String year, String month);

}
