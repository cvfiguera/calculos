package cl.calculos.model.sla.dao;

import java.util.Date;
import java.util.List;

import cl.calculos.model.sla.common.Bitacoras;
import cl.calculos.model.sla.common.DetalleDisponibilidad;
import cl.calculos.model.sla.common.DetalleVelocidad;
import cl.calculos.model.sla.common.Feriados;
import cl.calculos.model.sla.common.Prefacturas;
import cl.calculos.model.sla.common.ResumenDisponibilidad;
import cl.calculos.model.sla.common.ResumenVelocidad;

public interface SlaDao {
	
	public List<ResumenDisponibilidad> getResumenDispo(Integer rbd, Integer archivoId);
	
	public List<ResumenVelocidad> getResumenVel(Integer rbd, Integer archivoId);
	
	public List<DetalleDisponibilidad> getDetalleDispo(Integer rbd, Integer archivoId, Date fechaIni, Date fechaFin);
	
	public List<DetalleVelocidad> getDetalleVelBajada(Integer rbd, Integer archivoId, Date fechaIni, Date fechaFin);
	
	public List<DetalleVelocidad> getDetalleVelSubida(Integer rbd, Integer archivoId, Date fechaIni, Date fechaFin);
	
	public Prefacturas getPrefactura(Integer rbd, Integer archivoId);
	
	public List<Bitacoras> getBitacoraAprob(Integer rbd, Integer archivoId, Date fecha);
	
	public Boolean vieneEnResumenDispo(Integer rbd, Integer archivoId);
	
	public Boolean vieneEnResumenVel(Integer rbd, Integer archivoId);
	
	public Boolean tieneBitacoraaprob(Integer rbd, Integer archivoId);
	
	public Boolean vieneEnPrefactura(Integer rbd, Integer archivoId);
	
	public Boolean esFeriado(Date fecha);
	
	public List<Feriados> feriados(Date fechaIni, Date fechaFin);

}
