package cl.calculos.model.control.common;

import java.util.HashSet;
import java.util.Set;

public class TiposProceso implements java.io.Serializable {

	private static final long serialVersionUID = -4404894221587590957L;
	private int tipoProcesoId;
	private String nombre;
	private Set procesoses = new HashSet(0);

	public TiposProceso() {
	}

	public TiposProceso(int tipoProcesoId) {
		this.tipoProcesoId = tipoProcesoId;
	}

	public TiposProceso(int tipoProcesoId, String nombre, Set procesoses) {
		this.tipoProcesoId = tipoProcesoId;
		this.nombre = nombre;
		this.procesoses = procesoses;
	}

	public int getTipoProcesoId() {
		return this.tipoProcesoId;
	}

	public void setTipoProcesoId(int tipoProcesoId) {
		this.tipoProcesoId = tipoProcesoId;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getProcesoses() {
		return this.procesoses;
	}

	public void setProcesoses(Set procesoses) {
		this.procesoses = procesoses;
	}

}
