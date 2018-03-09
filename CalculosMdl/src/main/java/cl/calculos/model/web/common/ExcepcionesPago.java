package cl.calculos.model.web.common;

import java.util.Date;

public class ExcepcionesPago implements java.io.Serializable {

	private static final long serialVersionUID = 3535104534337438757L;
	private int excepcionPagoId;
	private RbdConcursos rbdConcursos;
	private Date fechaI;
	private Date fechaF;
	private String motivo;

	public ExcepcionesPago() {
	}

	public ExcepcionesPago(int excepcionPagoId) {
		this.excepcionPagoId = excepcionPagoId;
	}

	public ExcepcionesPago(int excepcionPagoId, RbdConcursos rbdConcursos, Date fechaI, Date fechaF, String motivo) {
		this.excepcionPagoId = excepcionPagoId;
		this.rbdConcursos = rbdConcursos;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.motivo = motivo;
	}

	public int getExcepcionPagoId() {
		return this.excepcionPagoId;
	}

	public void setExcepcionPagoId(int excepcionPagoId) {
		this.excepcionPagoId = excepcionPagoId;
	}

	public RbdConcursos getRbdConcursos() {
		return this.rbdConcursos;
	}

	public void setRbdConcursos(RbdConcursos rbdConcursos) {
		this.rbdConcursos = rbdConcursos;
	}

	public Date getFechaI() {
		return this.fechaI;
	}

	public void setFechaI(Date fechaI) {
		this.fechaI = fechaI;
	}

	public Date getFechaF() {
		return this.fechaF;
	}

	public void setFechaF(Date fechaF) {
		this.fechaF = fechaF;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
