package cl.calculos.model.web.common;
// Generated 03-07-2017 14:39:15 by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Rbd generated by hbm2java
 */
public class Rbd implements java.io.Serializable {

	private int rbdId;
	private Comunas comunas;
	private Long rbdNu;
	private String nombreEstablecimientoTx;
	private String direccionTx;
	private Long numAlumnosNu;
	private String observacionTx;
	private String anexoTx;
	private Set contactoses = new HashSet(0);
	private Set rbdConcursoses = new HashSet(0);
	private Set contactoses_1 = new HashSet(0);

	public Rbd() {
	}

	public Rbd(int rbdId) {
		this.rbdId = rbdId;
	}

	public Rbd(int rbdId, Comunas comunas, Long rbdNu, String nombreEstablecimientoTx, String direccionTx,
			Long numAlumnosNu, String observacionTx, String anexoTx, Set contactoses, Set rbdConcursoses,
			Set contactoses_1) {
		this.rbdId = rbdId;
		this.comunas = comunas;
		this.rbdNu = rbdNu;
		this.nombreEstablecimientoTx = nombreEstablecimientoTx;
		this.direccionTx = direccionTx;
		this.numAlumnosNu = numAlumnosNu;
		this.observacionTx = observacionTx;
		this.anexoTx = anexoTx;
		this.contactoses = contactoses;
		this.rbdConcursoses = rbdConcursoses;
		this.contactoses_1 = contactoses_1;
	}

	public int getRbdId() {
		return this.rbdId;
	}

	public void setRbdId(int rbdId) {
		this.rbdId = rbdId;
	}

	public Comunas getComunas() {
		return this.comunas;
	}

	public void setComunas(Comunas comunas) {
		this.comunas = comunas;
	}

	public Long getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Long rbdNu) {
		this.rbdNu = rbdNu;
	}

	public String getNombreEstablecimientoTx() {
		return this.nombreEstablecimientoTx;
	}

	public void setNombreEstablecimientoTx(String nombreEstablecimientoTx) {
		this.nombreEstablecimientoTx = nombreEstablecimientoTx;
	}

	public String getDireccionTx() {
		return this.direccionTx;
	}

	public void setDireccionTx(String direccionTx) {
		this.direccionTx = direccionTx;
	}

	public Long getNumAlumnosNu() {
		return this.numAlumnosNu;
	}

	public void setNumAlumnosNu(Long numAlumnosNu) {
		this.numAlumnosNu = numAlumnosNu;
	}

	public String getObservacionTx() {
		return this.observacionTx;
	}

	public void setObservacionTx(String observacionTx) {
		this.observacionTx = observacionTx;
	}

	public String getAnexoTx() {
		return this.anexoTx;
	}

	public void setAnexoTx(String anexoTx) {
		this.anexoTx = anexoTx;
	}

	public Set getContactoses() {
		return this.contactoses;
	}

	public void setContactoses(Set contactoses) {
		this.contactoses = contactoses;
	}

	public Set getRbdConcursoses() {
		return this.rbdConcursoses;
	}

	public void setRbdConcursoses(Set rbdConcursoses) {
		this.rbdConcursoses = rbdConcursoses;
	}

	public Set getContactoses_1() {
		return this.contactoses_1;
	}

	public void setContactoses_1(Set contactoses_1) {
		this.contactoses_1 = contactoses_1;
	}

}
