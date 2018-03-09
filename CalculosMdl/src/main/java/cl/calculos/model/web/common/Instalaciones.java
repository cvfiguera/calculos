package cl.calculos.model.web.common;

import java.math.BigDecimal;
import java.util.Date;

public class Instalaciones implements java.io.Serializable {

	private static final long serialVersionUID = -5554247740489830430L;
	private int instalacionId;
	private InstalacionExcepciones instalacionExcepciones;
	private Operadoras operadoras;
	private RbdConcursos rbdConcursos;
	private Tecnologias tecnologias;
	private TipoAdjudicaciones tipoAdjudicaciones;
	private BigDecimal precioInstalacionDecimal;
	private String urldocTx;
	private Date fechaAltaServicioFe;
	private String numeroFormularioAltaServicio;
	private BigDecimal velocidadNacionalNu;
	private BigDecimal velocidadInternacionalNu;
	private Date fechaDesintalacionFe;
	private Integer idci;

	public Instalaciones() {
	}

	public Instalaciones(int instalacionId, Operadoras operadoras, RbdConcursos rbdConcursos) {
		this.instalacionId = instalacionId;
		this.operadoras = operadoras;
		this.rbdConcursos = rbdConcursos;
	}

	public Instalaciones(int instalacionId, InstalacionExcepciones instalacionExcepciones, Operadoras operadoras,
			RbdConcursos rbdConcursos, Tecnologias tecnologias, TipoAdjudicaciones tipoAdjudicaciones,
			BigDecimal precioInstalacionDecimal, String urldocTx, Date fechaAltaServicioFe,
			String numeroFormularioAltaServicio, BigDecimal velocidadNacionalNu, BigDecimal velocidadInternacionalNu,
			Date fechaDesintalacionFe, Integer idci) {
		this.instalacionId = instalacionId;
		this.instalacionExcepciones = instalacionExcepciones;
		this.operadoras = operadoras;
		this.rbdConcursos = rbdConcursos;
		this.tecnologias = tecnologias;
		this.tipoAdjudicaciones = tipoAdjudicaciones;
		this.precioInstalacionDecimal = precioInstalacionDecimal;
		this.urldocTx = urldocTx;
		this.fechaAltaServicioFe = fechaAltaServicioFe;
		this.numeroFormularioAltaServicio = numeroFormularioAltaServicio;
		this.velocidadNacionalNu = velocidadNacionalNu;
		this.velocidadInternacionalNu = velocidadInternacionalNu;
		this.fechaDesintalacionFe = fechaDesintalacionFe;
		this.idci = idci;
	}

	public int getInstalacionId() {
		return this.instalacionId;
	}

	public void setInstalacionId(int instalacionId) {
		this.instalacionId = instalacionId;
	}

	public InstalacionExcepciones getInstalacionExcepciones() {
		return this.instalacionExcepciones;
	}

	public void setInstalacionExcepciones(InstalacionExcepciones instalacionExcepciones) {
		this.instalacionExcepciones = instalacionExcepciones;
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

	public BigDecimal getPrecioInstalacionDecimal() {
		return this.precioInstalacionDecimal;
	}

	public void setPrecioInstalacionDecimal(BigDecimal precioInstalacionDecimal) {
		this.precioInstalacionDecimal = precioInstalacionDecimal;
	}

	public String getUrldocTx() {
		return this.urldocTx;
	}

	public void setUrldocTx(String urldocTx) {
		this.urldocTx = urldocTx;
	}

	public Date getFechaAltaServicioFe() {
		return this.fechaAltaServicioFe;
	}

	public void setFechaAltaServicioFe(Date fechaAltaServicioFe) {
		this.fechaAltaServicioFe = fechaAltaServicioFe;
	}

	public String getNumeroFormularioAltaServicio() {
		return this.numeroFormularioAltaServicio;
	}

	public void setNumeroFormularioAltaServicio(String numeroFormularioAltaServicio) {
		this.numeroFormularioAltaServicio = numeroFormularioAltaServicio;
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

	public Date getFechaDesintalacionFe() {
		return this.fechaDesintalacionFe;
	}

	public void setFechaDesintalacionFe(Date fechaDesintalacionFe) {
		this.fechaDesintalacionFe = fechaDesintalacionFe;
	}

	public Integer getIdci() {
		return this.idci;
	}

	public void setIdci(Integer idci) {
		this.idci = idci;
	}

}
