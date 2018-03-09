package cl.calculos.model.web.common;

import java.util.HashSet;
import java.util.Set;

public class AdjudicadoEstados implements java.io.Serializable {

	private static final long serialVersionUID = 1038073638665390000L;
	private int adjudicadoEstadoId;
	private AdjudicadoEstados adjudicadoEstados;
	private String adjudicadoEstadoTx;
	private Set rbdEstadoses = new HashSet(0);
	private Set adjudicadoEstadoses = new HashSet(0);
	private Set adjudicadoEstadoses_1 = new HashSet(0);

	public AdjudicadoEstados() {
	}

	public AdjudicadoEstados(int adjudicadoEstadoId) {
		this.adjudicadoEstadoId = adjudicadoEstadoId;
	}

	public AdjudicadoEstados(int adjudicadoEstadoId, AdjudicadoEstados adjudicadoEstados, String adjudicadoEstadoTx,
			Set rbdEstadoses, Set adjudicadoEstadoses, Set adjudicadoEstadoses_1) {
		this.adjudicadoEstadoId = adjudicadoEstadoId;
		this.adjudicadoEstados = adjudicadoEstados;
		this.adjudicadoEstadoTx = adjudicadoEstadoTx;
		this.rbdEstadoses = rbdEstadoses;
		this.adjudicadoEstadoses = adjudicadoEstadoses;
		this.adjudicadoEstadoses_1 = adjudicadoEstadoses_1;
	}

	public int getAdjudicadoEstadoId() {
		return this.adjudicadoEstadoId;
	}

	public void setAdjudicadoEstadoId(int adjudicadoEstadoId) {
		this.adjudicadoEstadoId = adjudicadoEstadoId;
	}

	public AdjudicadoEstados getAdjudicadoEstados() {
		return this.adjudicadoEstados;
	}

	public void setAdjudicadoEstados(AdjudicadoEstados adjudicadoEstados) {
		this.adjudicadoEstados = adjudicadoEstados;
	}

	public String getAdjudicadoEstadoTx() {
		return this.adjudicadoEstadoTx;
	}

	public void setAdjudicadoEstadoTx(String adjudicadoEstadoTx) {
		this.adjudicadoEstadoTx = adjudicadoEstadoTx;
	}

	public Set getRbdEstadoses() {
		return this.rbdEstadoses;
	}

	public void setRbdEstadoses(Set rbdEstadoses) {
		this.rbdEstadoses = rbdEstadoses;
	}

	public Set getAdjudicadoEstadoses() {
		return this.adjudicadoEstadoses;
	}

	public void setAdjudicadoEstadoses(Set adjudicadoEstadoses) {
		this.adjudicadoEstadoses = adjudicadoEstadoses;
	}

	public Set getAdjudicadoEstadoses_1() {
		return this.adjudicadoEstadoses_1;
	}

	public void setAdjudicadoEstadoses_1(Set adjudicadoEstadoses_1) {
		this.adjudicadoEstadoses_1 = adjudicadoEstadoses_1;
	}

}
