package cl.calculos.model.control.common;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Procesos implements java.io.Serializable {

	private static final long serialVersionUID = 7803554137027769511L;
	private int procesoId;
	private TiposProceso tiposProceso;
	private Integer usuario;
	private Date fecha;
	private Integer estatus;
	private Set procesosDetalles = new HashSet(0);

	public Procesos() {
	}

	public Procesos(int procesoId) {
		this.procesoId = procesoId;
	}

	public Procesos(TiposProceso tiposProceso, Integer usuario, Date fecha, Integer estatus) {
		super();
		this.tiposProceso = tiposProceso;
		this.usuario = usuario;
		this.fecha = fecha;
		this.estatus = estatus;
	}

	public int getProcesoId() {
		return procesoId;
	}

	public void setProcesoId(int procesoId) {
		this.procesoId = procesoId;
	}

	public TiposProceso getTiposProceso() {
		return tiposProceso;
	}

	public void setTiposProceso(TiposProceso tiposProceso) {
		this.tiposProceso = tiposProceso;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Set getProcesosDetalles() {
		return procesosDetalles;
	}

	public void setProcesosDetalles(Set procesosDetalles) {
		this.procesosDetalles = procesosDetalles;
	}
}
