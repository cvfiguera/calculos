package cl.calculos.model.sla.common;

import java.math.BigDecimal;
import java.util.Date;

public class DetalleVelocidad implements java.io.Serializable {

	private static final long serialVersionUID = -4889769248026234470L;
	private int detalleVelocidadId;
	private Archivos archivos;
	private Date fechaHoraMuestraFe;
	private BigDecimal valorMuestraNu;
	private Boolean tipoBo;
	private Integer rbdNu;

	public DetalleVelocidad() {
	}

	public DetalleVelocidad(int detalleVelocidadId) {
		this.detalleVelocidadId = detalleVelocidadId;
	}

	public DetalleVelocidad(Archivos archivos, Date fechaHoraMuestraFe,
			BigDecimal valorMuestraNu, Boolean tipoBo, Integer rbdNu) {
		this.archivos = archivos;
		this.fechaHoraMuestraFe = fechaHoraMuestraFe;
		this.valorMuestraNu = valorMuestraNu;
		this.tipoBo = tipoBo;
		this.rbdNu = rbdNu;
	}

	public int getDetalleVelocidadId() {
		return this.detalleVelocidadId;
	}

	public void setDetalleVelocidadId(int detalleVelocidadId) {
		this.detalleVelocidadId = detalleVelocidadId;
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

	public BigDecimal getValorMuestraNu() {
		return this.valorMuestraNu;
	}

	public void setValorMuestraNu(BigDecimal valorMuestraNu) {
		this.valorMuestraNu = valorMuestraNu;
	}

	public Boolean getTipoBo() {
		return this.tipoBo;
	}

	public void setTipoBo(Boolean tipoBo) {
		this.tipoBo = tipoBo;
	}

	public Integer getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Integer rbdNu) {
		this.rbdNu = rbdNu;
	}

}
