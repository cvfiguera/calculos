package cl.calculos.model.web.common;
// Generated 03-07-2017 14:39:15 by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tecnologias generated by hbm2java
 */
public class Tecnologias implements java.io.Serializable {

	private int tecnologiaId;
	private String nombreTx;
	private String observacionTx;
	private Set instalacioneses = new HashSet(0);
	private Set adjudicacioneses = new HashSet(0);
	private Set listaEsperas = new HashSet(0);

	public Tecnologias() {
	}

	public Tecnologias(int tecnologiaId) {
		this.tecnologiaId = tecnologiaId;
	}

	public Tecnologias(int tecnologiaId, String nombreTx, String observacionTx, Set instalacioneses,
			Set adjudicacioneses, Set listaEsperas) {
		this.tecnologiaId = tecnologiaId;
		this.nombreTx = nombreTx;
		this.observacionTx = observacionTx;
		this.instalacioneses = instalacioneses;
		this.adjudicacioneses = adjudicacioneses;
		this.listaEsperas = listaEsperas;
	}

	public int getTecnologiaId() {
		return this.tecnologiaId;
	}

	public void setTecnologiaId(int tecnologiaId) {
		this.tecnologiaId = tecnologiaId;
	}

	public String getNombreTx() {
		return this.nombreTx;
	}

	public void setNombreTx(String nombreTx) {
		this.nombreTx = nombreTx;
	}

	public String getObservacionTx() {
		return this.observacionTx;
	}

	public void setObservacionTx(String observacionTx) {
		this.observacionTx = observacionTx;
	}

	public Set getInstalacioneses() {
		return this.instalacioneses;
	}

	public void setInstalacioneses(Set instalacioneses) {
		this.instalacioneses = instalacioneses;
	}

	public Set getAdjudicacioneses() {
		return this.adjudicacioneses;
	}

	public void setAdjudicacioneses(Set adjudicacioneses) {
		this.adjudicacioneses = adjudicacioneses;
	}

	public Set getListaEsperas() {
		return this.listaEsperas;
	}

	public void setListaEsperas(Set listaEsperas) {
		this.listaEsperas = listaEsperas;
	}

}