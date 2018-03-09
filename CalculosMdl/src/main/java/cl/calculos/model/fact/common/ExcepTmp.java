package cl.calculos.model.fact.common;
// Generated 08-03-2018 17:23:58 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * ExcepTmp generated by hbm2java
 */
public class ExcepTmp implements java.io.Serializable {

	private int excepTmpId;
	private FactTmp factTmp;
	private Date fechaIni;
	private Date fechaFin;
	private Boolean pago;

	public ExcepTmp() {
	}

	public ExcepTmp(int excepTmpId) {
		this.excepTmpId = excepTmpId;
	}

	public ExcepTmp(int excepTmpId, FactTmp factTmp, Date fechaIni, Date fechaFin, Boolean pago) {
		this.excepTmpId = excepTmpId;
		this.factTmp = factTmp;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.pago = pago;
	}

	public int getExcepTmpId() {
		return this.excepTmpId;
	}

	public void setExcepTmpId(int excepTmpId) {
		this.excepTmpId = excepTmpId;
	}

	public FactTmp getFactTmp() {
		return this.factTmp;
	}

	public void setFactTmp(FactTmp factTmp) {
		this.factTmp = factTmp;
	}

	public Date getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getPago() {
		return this.pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

}
