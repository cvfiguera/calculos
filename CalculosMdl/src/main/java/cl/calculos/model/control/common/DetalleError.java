package cl.calculos.model.control.common;

public class DetalleError implements java.io.Serializable {

	private static final long serialVersionUID = -852858227018205591L;
	private int detalleErrorId;
	private Archivo archivo;
	private ErrorCodigos errorCodigos;
	private Integer linea;
	private Integer posicion;
	private Integer rbd;
	private String valor;

	public DetalleError() {
	}

	public DetalleError(int detalleErrorId) {
		this.detalleErrorId = detalleErrorId;
	}

	public DetalleError(int detalleErrorId, Archivo archivo, ErrorCodigos errorCodigos, Integer linea, Integer posicion,
			Integer rbd, String valor) {
		this.detalleErrorId = detalleErrorId;
		this.archivo = archivo;
		this.errorCodigos = errorCodigos;
		this.linea = linea;
		this.posicion = posicion;
		this.rbd = rbd;
		this.valor = valor;
	}

	public int getDetalleErrorId() {
		return this.detalleErrorId;
	}

	public void setDetalleErrorId(int detalleErrorId) {
		this.detalleErrorId = detalleErrorId;
	}

	public Archivo getArchivo() {
		return this.archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public ErrorCodigos getErrorCodigos() {
		return this.errorCodigos;
	}

	public void setErrorCodigos(ErrorCodigos errorCodigos) {
		this.errorCodigos = errorCodigos;
	}

	public Integer getLinea() {
		return this.linea;
	}

	public void setLinea(Integer linea) {
		this.linea = linea;
	}

	public Integer getPosicion() {
		return this.posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Integer getRbd() {
		return this.rbd;
	}

	public void setRbd(Integer rbd) {
		this.rbd = rbd;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
