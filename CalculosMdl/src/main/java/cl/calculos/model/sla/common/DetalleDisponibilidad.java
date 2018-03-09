package cl.calculos.model.sla.common;
// Generated 03-07-2017 14:37:34 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

public class DetalleDisponibilidad implements java.io.Serializable {

	private static final long serialVersionUID = -429541874237645612L;
	private int detalleDispoId;
	private Archivos archivos;
	private Date fechaHoraMuestraFe;
	private Integer valorMuestraNu;
	private Integer rbdNu;

	public DetalleDisponibilidad() {
	}

	public DetalleDisponibilidad(int detalleDispoId) {
		this.detalleDispoId = detalleDispoId;
	}

	public DetalleDisponibilidad(Archivos archivos, Date fechaHoraMuestraFe, Integer valorMuestraNu,
			Integer rbdNu) {
		this.archivos = archivos;
		this.fechaHoraMuestraFe = fechaHoraMuestraFe;
		this.valorMuestraNu = valorMuestraNu;
		this.rbdNu = rbdNu;
	}

	public int getDetalleDispoId() {
		return this.detalleDispoId;
	}

	public void setDetalleDispoId(int detalleDispoId) {
		this.detalleDispoId = detalleDispoId;
	}

	public Archivos getArchivos() {
		return this.archivos;
	}

	public void setArchivos(Archivos archivos) {
		this.archivos = archivos;
	}

	public Date getFechaHoraMuestraFe() {
		return this.fechaHoraMuestraFe;
	}

	public void setFechaHoraMuestraFe(Date fechaHoraMuestraFe) {
		this.fechaHoraMuestraFe = fechaHoraMuestraFe;
	}

	public Integer getValorMuestraNu() {
		return this.valorMuestraNu;
	}

	public void setValorMuestraNu(Integer valorMuestraNu) {
		this.valorMuestraNu = valorMuestraNu;
	}

	public Integer getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Integer rbdNu) {
		this.rbdNu = rbdNu;
	}

}
