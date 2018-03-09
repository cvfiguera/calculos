package cl.calculos.model.web.common;

import java.math.BigDecimal;
import java.util.Date;

public class Adjudicaciones implements java.io.Serializable {

	private static final long serialVersionUID = 6277964484278920334L;
	private int adjudicacionId;
	private Operadoras operadoras;
	private RbdConcursos rbdConcursos;
	private Tecnologias tecnologias;
	private TipoAdjudicaciones tipoAdjudicaciones;
	private BigDecimal precioAdjudicacionNu;
	private BigDecimal velocidadNacionalNu;
	private BigDecimal velocidadInternacionalNu;
	private Date fechaAdjudicacion;
	private Date fechaDesadjudicacion;

	public Adjudicaciones() {
	}

	public Adjudicaciones(int adjudicacionId, Operadoras operadoras, RbdConcursos rbdConcursos) {
		this.adjudicacionId = adjudicacionId;
		this.operadoras = operadoras;
		this.rbdConcursos = rbdConcursos;
	}

	public Adjudicaciones(int adjudicacionId, Operadoras operadoras, RbdConcursos rbdConcursos, Tecnologias tecnologias,
			TipoAdjudicaciones tipoAdjudicaciones, BigDecimal precioAdjudicacionNu, BigDecimal velocidadNacionalNu,
			BigDecimal velocidadInternacionalNu, Date fechaAdjudicacion, Date fechaDesadjudicacion) {
		this.adjudicacionId = adjudicacionId;
		this.operadoras = operadoras;
		this.rbdConcursos = rbdConcursos;
		this.tecnologias = tecnologias;
		this.tipoAdjudicaciones = tipoAdjudicaciones;
		this.precioAdjudicacionNu = precioAdjudicacionNu;
		this.velocidadNacionalNu = velocidadNacionalNu;
		this.velocidadInternacionalNu = velocidadInternacionalNu;
		this.fechaAdjudicacion = fechaAdjudicacion;
		this.fechaDesadjudicacion = fechaDesadjudicacion;
	}

	public int getAdjudicacionId() {
		return this.adjudicacionId;
	}

	public void setAdjudicacionId(int adjudicacionId) {
		this.adjudicacionId = adjudicacionId;
	}

	public Operadoras getOperadoras() {
		return this.operadoras;
	}

	public void setOperadoras(Operadoras operadoras) {
		this.operadoras = operadoras;
	}

	public RbdConcursos getRbdConcursos() {
		return this.rbdConcursos;
	}

	public void setRbdConcursos(RbdConcursos rbdConcursos) {
		this.rbdConcursos = rbdConcursos;
	}

	public Tecnologias getTecnologias() {
		return this.tecnologias;
	}

	public void setTecnologias(Tecnologias tecnologias) {
		this.tecnologias = tecnologias;
	}

	public TipoAdjudicaciones getTipoAdjudicaciones() {
		return this.tipoAdjudicaciones;
	}

	public void setTipoAdjudicaciones(TipoAdjudicaciones tipoAdjudicaciones) {
		this.tipoAdjudicaciones = tipoAdjudicaciones;
	}

	public BigDecimal getPrecioAdjudicacionNu() {
		return this.precioAdjudicacionNu;
	}

	public void setPrecioAdjudicacionNu(BigDecimal precioAdjudicacionNu) {
		this.precioAdjudicacionNu = precioAdjudicacionNu;
	}

	public BigDecimal getVelocidadNacionalNu() {
		return this.velocidadNacionalNu;
	}

	public void setVelocidadNacionalNu(BigDecimal velocidadNacionalNu) {
		this.velocidadNacionalNu = velocidadNacionalNu;
	}

	public BigDecimal getVelocidadInternacionalNu() {
		return this.velocidadInternacionalNu;
	}

	public void setVelocidadInternacionalNu(BigDecimal velocidadInternacionalNu) {
		this.velocidadInternacionalNu = velocidadInternacionalNu;
	}

	public Date getFechaAdjudicacion() {
		return this.fechaAdjudicacion;
	}

	public void setFechaAdjudicacion(Date fechaAdjudicacion) {
		this.fechaAdjudicacion = fechaAdjudicacion;
	}

	public Date getFechaDesadjudicacion() {
		return this.fechaDesadjudicacion;
	}

	public void setFechaDesadjudicacion(Date fechaDesadjudicacion) {
		this.fechaDesadjudicacion = fechaDesadjudicacion;
	}

}
