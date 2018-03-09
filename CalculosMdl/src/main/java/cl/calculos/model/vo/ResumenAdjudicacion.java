package cl.calculos.model.vo;

import java.math.BigDecimal;
import java.util.Date;

public class ResumenAdjudicacion implements java.io.Serializable {

	private static final long serialVersionUID = -1855206281432568378L;
	private Integer rbd;
	private Integer concurso;
	private Integer operadora;
	private Integer tecnologia;
	private BigDecimal precio;
	private BigDecimal vbajada;
	private BigDecimal vsubida;
	private Date fadj;
	private Date fdsj;
	
	public ResumenAdjudicacion() {
		super();
	}

	public ResumenAdjudicacion(Integer rbd, Integer concurso, Integer operadora, Integer tecnologia, BigDecimal precio,
			BigDecimal vbajada, BigDecimal vsubida, Date fadj, Date fdsj) {
		super();
		this.rbd = rbd;
		this.concurso = concurso;
		this.operadora = operadora;
		this.tecnologia = tecnologia;
		this.precio = precio;
		this.vbajada = vbajada;
		this.vsubida = vsubida;
		this.fadj = fadj;
		this.fdsj = fdsj;
	}

	public Integer getRbd() {
		return rbd;
	}

	public void setRbd(Integer rbd) {
		this.rbd = rbd;
	}

	public Integer getConcurso() {
		return concurso;
	}

	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}

	public Integer getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(Integer tecnologia) {
		this.tecnologia = tecnologia;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getVbajada() {
		return vbajada;
	}

	public void setVbajada(BigDecimal vbajada) {
		this.vbajada = vbajada;
	}

	public BigDecimal getVsubida() {
		return vsubida;
	}

	public void setVsubida(BigDecimal vsubida) {
		this.vsubida = vsubida;
	}

	public Date getFadj() {
		return fadj;
	}

	public void setFadj(Date fadj) {
		this.fadj = fadj;
	}

	public Date getFdsj() {
		return fdsj;
	}

	public void setFdsj(Date fdsj) {
		this.fdsj = fdsj;
	}
}
