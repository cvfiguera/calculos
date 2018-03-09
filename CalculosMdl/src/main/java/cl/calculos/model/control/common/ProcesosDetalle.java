package cl.calculos.model.control.common;

public class ProcesosDetalle implements java.io.Serializable {

	private static final long serialVersionUID = -7623239782551444668L;
	private int procesoDetalleId;
	private Archivo archivo;
	private Estados estados;
	private Procesos procesos;

	public ProcesosDetalle() {
	}

	public ProcesosDetalle(int procesoDetalleId) {
		this.procesoDetalleId = procesoDetalleId;
	}

	public ProcesosDetalle(int procesoDetalleId, Archivo archivo, Estados estados, Procesos procesos) {
		this.procesoDetalleId = procesoDetalleId;
		this.archivo = archivo;
		this.estados = estados;
		this.procesos = procesos;
	}
	
	public ProcesosDetalle(Archivo archivo, Estados estados, Procesos procesos) {
		this.archivo = archivo;
		this.estados = estados;
		this.procesos = procesos;
	}

	public int getProcesoDetalleId() {
		return this.procesoDetalleId;
	}

	public void setProcesoDetalleId(int procesoDetalleId) {
		this.procesoDetalleId = procesoDetalleId;
	}

	public Archivo getArchivo() {
		return this.archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

	public Estados getEstados() {
		return this.estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	public Procesos getProcesos() {
		return this.procesos;
	}

	public void setProcesos(Procesos procesos) {
		this.procesos = procesos;
	}

}
