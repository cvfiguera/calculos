package cl.calculos.model.control.common;

import java.util.HashSet;
import java.util.Set;

public class ErrorCodigos implements java.io.Serializable {

	private static final long serialVersionUID = 9112117428200571288L;
	private int errorCodigoId;
	private Integer codigo;
	private String descripcion;
	private Set detalleErrors = new HashSet(0);

	public ErrorCodigos() {
	}

	public ErrorCodigos(int errorCodigoId) {
		this.errorCodigoId = errorCodigoId;
	}

	public ErrorCodigos(int errorCodigoId, Integer codigo, String descripcion, Set detalleErrors) {
		this.errorCodigoId = errorCodigoId;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.detalleErrors = detalleErrors;
	}

	public int getErrorCodigoId() {
		return this.errorCodigoId;
	}

	public void setErrorCodigoId(int errorCodigoId) {
		this.errorCodigoId = errorCodigoId;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getDetalleErrors() {
		return this.detalleErrors;
	}

	public void setDetalleErrors(Set detalleErrors) {
		this.detalleErrors = detalleErrors;
	}

}
