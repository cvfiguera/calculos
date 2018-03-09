package cl.calculos.model.control.common;

import java.util.HashSet;
import java.util.Set;

public class Estados implements java.io.Serializable {

	private static final long serialVersionUID = 6878130390532483597L;
	private int estadoArchivoId;
	private Integer codigo;
	private String estado;
	private Set procesosDetalles = new HashSet(0);

	public Estados() {
	}

	public Estados(int estadoArchivoId) {
		this.estadoArchivoId = estadoArchivoId;
	}

	public Estados(int estadoArchivoId, Integer codigo, String estado, Set procesosDetalles) {
		this.estadoArchivoId = estadoArchivoId;
		this.codigo = codigo;
		this.estado = estado;
		this.procesosDetalles = procesosDetalles;
	}

	public int getEstadoArchivoId() {
		return this.estadoArchivoId;
	}

	public void setEstadoArchivoId(int estadoArchivoId) {
		this.estadoArchivoId = estadoArchivoId;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set getProcesosDetalles() {
		return this.procesosDetalles;
	}

	public void setProcesosDetalles(Set procesosDetalles) {
		this.procesosDetalles = procesosDetalles;
	}

}
