package cl.calculos.model.control.common;

public class ArchivoId implements java.io.Serializable {

	private static final long serialVersionUID = -7013069376764090484L;
	private int archivoId;
	private String nombreArchivo;

	public ArchivoId() {
	}

	public ArchivoId(int archivoId, String nombreArchivo) {
		this.archivoId = archivoId;
		this.nombreArchivo = nombreArchivo;
	}

	public int getArchivoId() {
		return this.archivoId;
	}

	public void setArchivoId(int archivoId) {
		this.archivoId = archivoId;
	}

	public String getNombreArchivo() {
		return this.nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ArchivoId))
			return false;
		ArchivoId castOther = (ArchivoId) other;

		return (this.getArchivoId() == castOther.getArchivoId())
				&& ((this.getNombreArchivo() == castOther.getNombreArchivo())
						|| (this.getNombreArchivo() != null && castOther.getNombreArchivo() != null
								&& this.getNombreArchivo().equals(castOther.getNombreArchivo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getArchivoId();
		result = 37 * result + (getNombreArchivo() == null ? 0 : this.getNombreArchivo().hashCode());
		return result;
	}

}
