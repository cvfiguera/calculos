package cl.calculos.model.fact.common;

import java.math.BigDecimal;
import java.util.Date;

public class AdjTmp implements java.io.Serializable {

	private static final long serialVersionUID = -6630752098922072220L;
	private int adjTmpId;
	private FactTmp factTmp;
	private Integer rbdId;
	private Date FAdjudicacion;
	private Date FDesadjudicacion;
	private BigDecimal precio;
	private BigDecimal VBajada;
	private BigDecimal VSubida;
	private Integer concurso;
	private Integer operadora;
	private Integer tecnologia;

	public AdjTmp() {
	}

	public AdjTmp(int adjTmpId) {
		this.adjTmpId = adjTmpId;
	}

	public AdjTmp(FactTmp factTmp, Integer rbdId, Date FAdjudicacion, Date FDesadjudicacion,
			BigDecimal precio, BigDecimal VBajada, BigDecimal VSubida, Integer concurso, Integer operadora,
			Integer tecnologia) {
		this.factTmp = factTmp;
		this.rbdId = rbdId;
		this.FAdjudicacion = FAdjudicacion;
		this.FDesadjudicacion = FDesadjudicacion;
		this.precio = precio;
		this.VBajada = VBajada;
		this.VSubida = VSubida;
		this.concurso = concurso;
		this.operadora = operadora;
		this.tecnologia = tecnologia;
	}

	public int getAdjTmpId() {
		return this.adjTmpId;
	}

	public void setAdjTmpId(int adjTmpId) {
		this.adjTmpId = adjTmpId;
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

	public Date getFAdjudicacion() {
		return this.FAdjudicacion;
	}

	public void setFAdjudicacion(Date FAdjudicacion) {
		this.FAdjudicacion = FAdjudicacion;
	}

	public Date getFDesadjudicacion() {
		return this.FDesadjudicacion;
	}

	public void setFDesadjudicacion(Date FDesadjudicacion) {
		this.FDesadjudicacion = FDesadjudicacion;
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
