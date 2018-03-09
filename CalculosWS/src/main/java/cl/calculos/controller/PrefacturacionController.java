package cl.calculos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.calculos.business.prefacturacion.PrefacturacionService;
import cl.calculos.business.vo.ArchivoVO;
import cl.calculos.model.fact.common.FactTmp;

@RestController
public class PrefacturacionController {
	
	@Autowired
	private PrefacturacionService pService;
	
	@RequestMapping(value = "/sla", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<ArchivoVO>> getArchivos(
			@RequestParam(value="concurso") Integer concurso,
			@RequestParam(value="operadora") Integer operadora, 
			@RequestParam(value="mes") String month,
			@RequestParam(value="anio") String year) {
		
	 return new ResponseEntity<>(pService.getPrefacturasProcesadas(operadora,  year, month), HttpStatus.OK);
	
	}
	
	@RequestMapping(value = "/sla", method = RequestMethod.POST)
	public ResponseEntity<Boolean> calcular(
			@RequestParam(value="concurso") Integer concurso,
			@RequestParam(value="operadora") Integer operadora, 
			@RequestParam(value="mes") String month,
			@RequestParam(value="anio") String year) {
	 pService.calcularResumenMes(concurso, operadora, year, month);
	 return new ResponseEntity<>(true, HttpStatus.OK);
	
	}

}
