package cl.calculos.model.control.common;

import java.util.Date;

public class ProcesoDetalle implements java.io.Serializable {
	
	private static final long serialVersionUID = 2984783526286489039L;
	private Integer archivoId;
	private String tipoArchivo;
	private Date fecha;
	private Integer version;
	private String estado;
	
	public ProcesoDetalle() {
		super();
	}

	public ProcesoDetalle(Integer archivoId, String tipoArchivo, Date fecha, Integer version, String estado) {
		super();
		this.archivoId = archivoId;
		this.tipoArchivo = tipoArchivo;
		this.fecha = fecha;
		this.version = version;
		this.estado = estado;
	}

	public Integer getArchivoId() {
		return archivoId;
	}

	public void setArchivoId(Integer archivoId) {
		this.archivoId = archivoId;
	}

	public String getTipoArchivo() {
		return tipoArchivo;
	}

	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
