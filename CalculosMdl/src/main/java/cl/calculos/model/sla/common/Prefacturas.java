package cl.calculos.model.sla.common;

import java.math.BigDecimal;
import java.util.Date;

public class Prefacturas implements java.io.Serializable {

	private static final long serialVersionUID = 2719186945479632645L;
	private int prefacturaId;
	private Archivos archivos;
	private Integer diasFacturadosNu;
	private BigDecimal promDiasFacturadosNu;
	private BigDecimal valorMenAdjudicadoNu;
	private BigDecimal valorMesNetoNu;
	private BigDecimal valorMesNu;
	private Integer diasMesNu;
	private BigDecimal velocidadNu;
	private BigDecimal disponibilidadNu;
	private String anexoTx;
	private String observacionTx;
	private Date fechaAltaServicioFe;
	private String numFasTx;
	private Integer rbdNu;

	public Prefacturas() {
	}

	public Prefacturas(int prefacturaId) {
		this.prefacturaId = prefacturaId;
	}

	public Prefacturas(Archivos archivos, Integer diasFacturadosNu, BigDecimal promDiasFacturadosNu,
			BigDecimal valorMenAdjudicadoNu, BigDecimal valorMesNetoNu, BigDecimal valorMesNu, Integer diasMesNu,
			BigDecimal velocidadNu, BigDecimal disponibilidadNu, String anexoTx, String observacionTx,
			Date fechaAltaServicioFe, String numFasTx, Integer rbdNu) {;
		this.archivos = archivos;
		this.diasFacturadosNu = diasFacturadosNu;
		this.promDiasFacturadosNu = promDiasFacturadosNu;
		this.valorMenAdjudicadoNu = valorMenAdjudicadoNu;
		this.valorMesNetoNu = valorMesNetoNu;
		this.valorMesNu = valorMesNu;
		this.diasMesNu = diasMesNu;
		this.velocidadNu = velocidadNu;
		this.disponibilidadNu = disponibilidadNu;
		this.anexoTx = anexoTx;
		this.observacionTx = observacionTx;
		this.fechaAltaServicioFe = fechaAltaServicioFe;
		this.numFasTx = numFasTx;
		this.rbdNu = rbdNu;
	}

	public int getPrefacturaId() {
		return this.prefacturaId;
	}

	public void setPrefacturaId(int prefacturaId) {
		this.prefacturaId = prefacturaId;
	}

	public Archivos getArchivos() {
		return this.archivos;
	}

	public void setArchivos(Archivos archivos) {
		this.archivos = archivos;
	}

	public Integer getDiasFacturadosNu() {
		return this.diasFacturadosNu;
	}

	public void setDiasFacturadosNu(Integer diasFacturadosNu) {
		this.diasFacturadosNu = diasFacturadosNu;
	}

	public BigDecimal getPromDiasFacturadosNu() {
		return this.promDiasFacturadosNu;
	}

	public void setPromDiasFacturadosNu(BigDecimal promDiasFacturadosNu) {
		this.promDiasFacturadosNu = promDiasFacturadosNu;
	}

	public BigDecimal getValorMenAdjudicadoNu() {
		return this.valorMenAdjudicadoNu;
	}

	public void setValorMenAdjudicadoNu(BigDecimal valorMenAdjudicadoNu) {
		this.valorMenAdjudicadoNu = valorMenAdjudicadoNu;
	}

	public BigDecimal getValorMesNetoNu() {
		return this.valorMesNetoNu;
	}

	public void setValorMesNetoNu(BigDecimal valorMesNetoNu) {
		this.valorMesNetoNu = valorMesNetoNu;
	}

	public BigDecimal getValorMesNu() {
		return this.valorMesNu;
	}

	public void setValorMesNu(BigDecimal valorMesNu) {
		this.valorMesNu = valorMesNu;
	}

	public Integer getDiasMesNu() {
		return this.diasMesNu;
	}

	public void setDiasMesNu(Integer diasMesNu) {
		this.diasMesNu = diasMesNu;
	}

	public BigDecimal getVelocidadNu() {
		return this.velocidadNu;
	}

	public void setVelocidadNu(BigDecimal velocidadNu) {
		this.velocidadNu = velocidadNu;
	}

	public BigDecimal getDisponibilidadNu() {
		return this.disponibilidadNu;
	}

	public void setDisponibilidadNu(BigDecimal disponibilidadNu) {
		this.disponibilidadNu = disponibilidadNu;
	}

	public String getAnexoTx() {
		return this.anexoTx;
	}

	public void setAnexoTx(String anexoTx) {
		this.anexoTx = anexoTx;
	}

	public String getObservacionTx() {
		return this.observacionTx;
	}

	public void setObservacionTx(String observacionTx) {
		this.observacionTx = observacionTx;
	}

	public Date getFechaAltaServicioFe() {
		return this.fechaAltaServicioFe;
	}

	public void setFechaAltaServicioFe(Date fechaAltaServicioFe) {
		this.fechaAltaServicioFe = fechaAltaServicioFe;
	}

	public String getNumFasTx() {
		return this.numFasTx;
	}

	public void setNumFasTx(String numFasTx) {
		this.numFasTx = numFasTx;
	}

	public Integer getRbdNu() {
		return this.rbdNu;
	}

	public void setRbdNu(Integer rbdNu) {
		this.rbdNu = rbdNu;
	}

}
