package cl.calculos.model.web.common;

import java.math.BigDecimal;

public class ListaEspera implements java.io.Serializable {

	private static final long serialVersionUID = 5158786999468548718L;
	private int listaEsperaId;
	private Operadoras operadoras;
	private RbdConcursos rbdConcursos;
	private Tecnologias tecnologias;
	private TipoAdjudicaciones tipoAdjudicaciones;
	private BigDecimal velocidadNacionalNu;
	private BigDecimal velocidadInternacionalNu;
	private BigDecimal precioNu;

	public ListaEspera() {
	}

	public ListaEspera(int listaEsperaId) {
		this.listaEsperaId = listaEsperaId;
	}

	public ListaEspera(int listaEsperaId, Operadoras operadoras, RbdConcursos rbdConcursos, Tecnologias tecnologias,
			TipoAdjudicaciones tipoAdjudicaciones, BigDecimal velocidadNacionalNu, BigDecimal velocidadInternacionalNu,
			BigDecimal precioNu) {
		this.listaEsperaId = listaEsperaId;
		this.operadoras = operadoras;
		this.rbdConcursos = rbdConcursos;
		this.tecnologias = tecnologias;
		this.tipoAdjudicaciones = tipoAdjudicaciones;
		this.velocidadNacionalNu = velocidadNacionalNu;
		this.velocidadInternacionalNu = velocidadInternacionalNu;
		this.precioNu = precioNu;
	}

	public int getListaEsperaId() {
		return this.listaEsperaId;
	}

	public void setListaEsperaId(int listaEsperaId) {
		this.listaEsperaId = listaEsperaId;
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

	public BigDecimal getPrecioNu() {
		return this.precioNu;
	}

	public void setPrecioNu(BigDecimal precioNu) {
		this.precioNu = precioNu;
	}

}
