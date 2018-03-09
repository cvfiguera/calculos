package cl.calculos.model.sla.common;

import java.math.BigDecimal;
import java.util.Date;

public class ResumenDisponibilidad implements java.io.Serializable {

	private static final long serialVersionUID = 8166710387777726909L;
	private int resumenDisponibilidadId;
	private Archivos archivos;
	private Date fechaMuestraFe;
	private BigDecimal promedioDiarioNu;
	private Integer rbdNu;

	public ResumenDisponibilidad() {
	}

	public ResumenDisponibilidad(int resumenDisponibilidadId) {
		this.resumenDisponibilidadId = resumenDisponibilidadId;
	}

	public ResumenDisponibilidad(Archivos archivos, Date fechaMuestraFe,
			BigDecimal promedioDiarioNu, Integer rbdNu) {
		this.archivos = archivos;
		this.fechaMuestraFe = fechaMuestraFe;
		this.promedioDiarioNu = promedioDiarioNu;
		this.rbdNu = rbdNu;
	}

	public int getResumenDisponibilidadId() {
		return this.resumenDisponibilidadId;
	}

	public void setResumenDisponibilidadId(int resumenDisponibilidadId) {
		this.resumenDisponibilidadId = resumenDisponibilidadId;
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

	public BigDecimal getPromedioDiarioNu() {
		return this.promedioDiarioNu;
	}

	public void setPromedioDiarioNu(BigDecimal promedioDiarioNu) {
		this.promedioDiarioNu = promedioDiarioNu;
	}

	public Integer getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Integer rbdNu) {
		this.rbdNu = rbdNu;
	}

}
