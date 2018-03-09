package cl.calculos.model.sla.common;

import java.util.Date;

public class Bitacoras implements java.io.Serializable {

	private static final long serialVersionUID = -3447198469099734394L;
	private int bitacoraId;
	private Archivos archivos;
	private Date fechaInicioFe;
	private Date fechaFinFe;
	private Date horaInicioTi;
	private Date horaFinTi;
	private Integer diaSemanaNu;
	private Integer rbdNu;

	public Bitacoras() {
	}

	public Bitacoras(int bitacoraId) {
		this.bitacoraId = bitacoraId;
	}

	public Bitacoras(Archivos archivos, Date fechaInicioFe, Date fechaFinFe, Date horaInicioTi,
			Date horaFinTi, Integer diaSemanaNu, Integer rbdNu) {
		this.archivos = archivos;
		this.fechaInicioFe = fechaInicioFe;
		this.fechaFinFe = fechaFinFe;
		this.horaInicioTi = horaInicioTi;
		this.horaFinTi = horaFinTi;
		this.diaSemanaNu = diaSemanaNu;
		this.rbdNu = rbdNu;
	}

	public int getBitacoraId() {
		return this.bitacoraId;
	}

	public void setBitacoraId(int bitacoraId) {
		this.bitacoraId = bitacoraId;
	}

	public Archivos getArchivos() {
		return this.archivos;
	}

	public void setArchivos(Archivos archivos) {
		this.archivos = archivos;
	}

	public Date getFechaInicioFe() {
		return this.fechaInicioFe;
	}

	public void setFechaInicioFe(Date fechaInicioFe) {
		this.fechaInicioFe = fechaInicioFe;
	}

	public Date getFechaFinFe() {
		return this.fechaFinFe;
	}

	public void setFechaFinFe(Date fechaFinFe) {
		this.fechaFinFe = fechaFinFe;
	}

	public Date getHoraInicioTi() {
		return this.horaInicioTi;
	}

	public void setHoraInicioTi(Date horaInicioTi) {
		this.horaInicioTi = horaInicioTi;
	}

	public Date getHoraFinTi() {
		return this.horaFinTi;
	}

	public void setHoraFinTi(Date horaFinTi) {
		this.horaFinTi = horaFinTi;
	}

	public Integer getDiaSemanaNu() {
		return this.diaSemanaNu;
	}

	public void setDiaSemanaNu(Integer diaSemanaNu) {
		this.diaSemanaNu = diaSemanaNu;
	}

	public Integer getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Integer rbdNu) {
		this.rbdNu = rbdNu;
	}

}
