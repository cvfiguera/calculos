package cl.calculos.model.web.common;

import java.util.HashSet;
import java.util.Set;

public class ConectadoEstados implements java.io.Serializable {

	private static final long serialVersionUID = 5397278270043758624L;
	private int conectadoEstadoId;
	private String conectadoEstadoTx;
	private Integer padreId;
	private Set rbdEstadoses = new HashSet(0);

	public ConectadoEstados() {
	}

	public ConectadoEstados(int conectadoEstadoId) {
		this.conectadoEstadoId = conectadoEstadoId;
	}

	public ConectadoEstados(int conectadoEstadoId, String conectadoEstadoTx, Integer padreId, Set rbdEstadoses) {
		this.conectadoEstadoId = conectadoEstadoId;
		this.conectadoEstadoTx = conectadoEstadoTx;
		this.padreId = padreId;
		this.rbdEstadoses = rbdEstadoses;
	}

	public int getConectadoEstadoId() {
		return this.conectadoEstadoId;
	}

	public void setConectadoEstadoId(int conectadoEstadoId) {
		this.conectadoEstadoId = conectadoEstadoId;
	}

	public String getConectadoEstadoTx() {
		return this.conectadoEstadoTx;
	}

	public void setConectadoEstadoTx(String conectadoEstadoTx) {
		this.conectadoEstadoTx = conectadoEstadoTx;
	}

	public Integer getPadreId() {
		return this.padreId;
	}

	public void setPadreId(Integer padreId) {
		this.padreId = padreId;
	}

	public Set getRbdEstadoses() {
		return this.rbdEstadoses;
	}

	public void setRbdEstadoses(Set rbdEstadoses) {
		this.rbdEstadoses = rbdEstadoses;
	}

}
