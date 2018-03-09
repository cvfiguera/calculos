package cl.calculos.model.fact.common;

import java.math.BigDecimal;
import java.util.Date;

public class InstTmp implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int instTmpId;
	private FactTmp factTmp;
	private Integer rbdId;
	private Date fechaAlta;
	private Date fechaBaja;
	private BigDecimal precio;
	private BigDecimal VBajada;
	private BigDecimal VSubida;
	private Integer concurso;
	private Integer operadora;
	private Integer tecnologia;

	public InstTmp() {
	}

	public InstTmp(int instTmpId) {
		this.instTmpId = instTmpId;
	}

	public InstTmp(FactTmp factTmp, Integer rbdId, Date fechaAlta, Date fechaBaja, BigDecimal precio,
			BigDecimal VBajada, BigDecimal VSubida, Integer concurso, Integer operadora, Integer tecnologia) {
		this.factTmp = factTmp;
		this.rbdId = rbdId;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.precio = precio;
		this.VBajada = VBajada;
		this.VSubida = VSubida;
		this.concurso = concurso;
		this.operadora = operadora;
		this.tecnologia = tecnologia;
	}

	public int getInstTmpId() {
		return this.instTmpId;
	}

	public void setInstTmpId(int instTmpId) {
		this.instTmpId = instTmpId;
	}

	public FactTmp getFactTmp() {
		return this.factTmp;
	}

	public void setFactTmp(FactTmp factTmp) {
		this.factTmp = factTmp;
	}

	public Integer getRbdId() {
		return this.rbdId;
	}

	public void setRbdId(Integer rbdId) {
		this.rbdId = rbdId;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getVBajada() {
		return this.VBajada;
	}

	public void setVBajada(BigDecimal VBajada) {
		this.VBajada = VBajada;
	}

	public BigDecimal getVSubida() {
		return this.VSubida;
	}

	public void setVSubida(BigDecimal VSubida) {
		this.VSubida = VSubida;
	}

	public Integer getConcurso() {
		return this.concurso;
	}

	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}

	public Integer getOperadora() {
		return this.operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}

	public Integer getTecnologia() {
		return this.tecnologia;
	}

	public void setTecnologia(Integer tecnologia) {
		this.tecnologia = tecnologia;
	}

}
