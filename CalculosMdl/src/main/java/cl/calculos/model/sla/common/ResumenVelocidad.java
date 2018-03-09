package cl.calculos.model.sla.common;

import java.math.BigDecimal;
import java.util.Date;

public class ResumenVelocidad implements java.io.Serializable {

	private static final long serialVersionUID = 2554018989331759520L;
	private int resumenVelocidadId;
	private Archivos archivos;
	private Date fechaMuestraFe;
	private BigDecimal velocidadSubidaDiariaNu;
	private BigDecimal velocidadBajadaDiariaNu;
	private Integer rbdNu;

	public ResumenVelocidad() {
	}

	public ResumenVelocidad(int resumenVelocidadId) {
		this.resumenVelocidadId = resumenVelocidadId;
	}

	public ResumenVelocidad(Archivos archivos, Date fechaMuestraFe,
			BigDecimal velocidadSubidaDiariaNu, BigDecimal velocidadBajadaDiariaNu, Integer rbdNu) {
		this.archivos = archivos;
		this.fechaMuestraFe = fechaMuestraFe;
		this.velocidadSubidaDiariaNu = velocidadSubidaDiariaNu;
		this.velocidadBajadaDiariaNu = velocidadBajadaDiariaNu;
		this.rbdNu = rbdNu;
	}

	public int getResumenVelocidadId() {
		return this.resumenVelocidadId;
	}

	public void setResumenVelocidadId(int resumenVelocidadId) {
		this.resumenVelocidadId = resumenVelocidadId;
	}

	public Archivos getArchivos() {
		return this.archivos;
	}

	public void setArchivos(Archivos archivos) {
		this.archivos = archivos;
	}

	public Date getFechaMuestraFe() {
		return this.fechaMuestraFe;
	}

	public void setFechaMuestraFe(Date fechaMuestraFe) {
		this.fechaMuestraFe = fechaMuestraFe;
	}

	public BigDecimal getVelocidadSubidaDiariaNu() {
		return this.velocidadSubidaDiariaNu;
	}

	public void setVelocidadSubidaDiariaNu(BigDecimal velocidadSubidaDiariaNu) {
		this.velocidadSubidaDiariaNu = velocidadSubidaDiariaNu;
	}

	public BigDecimal getVelocidadBajadaDiariaNu() {
		return this.velocidadBajadaDiariaNu;
	}

	public void setVelocidadBajadaDiariaNu(BigDecimal velocidadBajadaDiariaNu) {
		this.velocidadBajadaDiariaNu = velocidadBajadaDiariaNu;
	}

	public Integer getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Integer rbdNu) {
		this.rbdNu = rbdNu;
	}

}
