package cl.calculos.model.control.common;

import java.util.HashSet;
import java.util.Set;

public class ArchivosTipos implements java.io.Serializable {
	
	private static final long serialVersionUID = -1411247760948380447L;
	private int archivoTipoId;
	private String tipo;
	private Set archivos = new HashSet(0);

	public ArchivosTipos() {
	}

	public ArchivosTipos(int archivoTipoId) {
		this.archivoTipoId = archivoTipoId;
	}

	public ArchivosTipos(int archivoTipoId, String tipo, Set archivos) {
		this.archivoTipoId = archivoTipoId;
		this.tipo = tipo;
		this.archivos = archivos;
	}

	public int getArchivoTipoId() {
		return this.archivoTipoId;
	}

	public void setArchivoTipoId(int archivoTipoId) {
		this.archivoTipoId = archivoTipoId;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set getArchivos() {
		return this.archivos;
	}

	public void setArchivos(Set archivos) {
		this.archivos = archivos;
	}

}
