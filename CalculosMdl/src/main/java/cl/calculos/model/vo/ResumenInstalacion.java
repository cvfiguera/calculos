package cl.calculos.model.vo;

import java.math.BigDecimal;
import java.util.Date;

public class ResumenInstalacion implements java.io.Serializable {
	
	private static final long serialVersionUID = -2641901798488163711L;
	private Integer rbd;
	private Integer concurso;
	private Integer operadora;
	private Date falta;
	private Date fbaja;
	private Integer tecnologia;
	private BigDecimal precio;
	private BigDecimal vbajada;
	private BigDecimal vsubida;
	private Integer excepcion;
	
	public ResumenInstalacion() {
		super();
	}

	public ResumenInstalacion(Integer rbd, Integer concurso, Integer operadora, Date falta, Date fbaja,
			Integer tecnologia, BigDecimal precio, BigDecimal vbajada, BigDecimal vsubida, Integer excepcion) {
		super();
		this.rbd = rbd;
		this.concurso = concurso;
		this.operadora = operadora;
		this.falta = falta;
		this.fbaja = fbaja;
		this.tecnologia = tecnologia;
		this.precio = precio;
		this.vbajada = vbajada;
		this.vsubida = vsubida;
		this.excepcion = excepcion;
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

	public Date getFalta() {
		return falta;
	}

	public void setFalta(Date falta) {
		this.falta = falta;
	}

	public Date getFbaja() {
		return fbaja;
	}

	public void setFbaja(Date fbaja) {
		this.fbaja = fbaja;
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

	public Integer getExcepcion() {
		return excepcion;
	}

	public void setExcepcion(Integer excepcion) {
		this.excepcion = excepcion;
	}

	
}
