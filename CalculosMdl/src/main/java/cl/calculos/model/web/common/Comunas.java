package cl.calculos.model.web.common;

import java.util.HashSet;
import java.util.Set;

public class Comunas implements java.io.Serializable {

	private static final long serialVersionUID = 713287562262441197L;
	private int comunaId;
	private Regiones regiones;
	private String nombreComunaTx;
	private Integer numeroComuna;
	private Set rbds = new HashSet(0);
	private Set rbds_1 = new HashSet(0);

	public Comunas() {
	}

	public Comunas(int comunaId) {
		this.comunaId = comunaId;
	}

	public Comunas(int comunaId, Regiones regiones, String nombreComunaTx, Integer numeroComuna, Set rbds, Set rbds_1) {
		this.comunaId = comunaId;
		this.regiones = regiones;
		this.nombreComunaTx = nombreComunaTx;
		this.numeroComuna = numeroComuna;
		this.rbds = rbds;
		this.rbds_1 = rbds_1;
	}

	public int getComunaId() {
		return this.comunaId;
	}

	public void setComunaId(int comunaId) {
		this.comunaId = comunaId;
	}

	public Regiones getRegiones() {
		return this.regiones;
	}

	public void setRegiones(Regiones regiones) {
		this.regiones = regiones;
	}

	public String getNombreComunaTx() {
		return this.nombreComunaTx;
	}

	public void setNombreComunaTx(String nombreComunaTx) {
		this.nombreComunaTx = nombreComunaTx;
	}

	public Integer getNumeroComuna() {
		return this.numeroComuna;
	}

	public void setNumeroComuna(Integer numeroComuna) {
		this.numeroComuna = numeroComuna;
	}

	public Set getRbds() {
		return this.rbds;
	}

	public void setRbds(Set rbds) {
		this.rbds = rbds;
	}

	public Set getRbds_1() {
		return this.rbds_1;
	}

	public void setRbds_1(Set rbds_1) {
		this.rbds_1 = rbds_1;
	}

}
