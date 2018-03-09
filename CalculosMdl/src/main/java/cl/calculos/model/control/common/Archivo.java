package cl.calculos.model.control.common;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Archivo implements java.io.Serializable {

	private static final long serialVersionUID = 681405159658405011L;
	private ArchivoId id;
	private int version;
	private ArchivosTipos archivosTipos;
	private Integer operadora;
	private String ano;
	private String mes;
	private Date fechaFtp;
	private String ruta;
	private Set procesosDetalles = new HashSet(0);

	public Archivo() {
	}

	public Archivo(ArchivoId id) {
		this.id = id;
	}

	public Archivo(ArchivoId id, int version, ArchivosTipos archivosTipos, Integer operadora, String ano, String mes,
			Date fechaFtp, String ruta, Set procesosDetalles) {
		super();
		this.id = id;
		this.version = version;
		this.archivosTipos = archivosTipos;
		this.operadora = operadora;
		this.ano = ano;
		this.mes = mes;
		this.fechaFtp = fechaFtp;
		this.ruta = ruta;
		this.procesosDetalles = procesosDetalles;
	}

	public ArchivoId getId() {
		return id;
	}

	public void setId(ArchivoId id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public ArchivosTipos getArchivosTipos() {
		return archivosTipos;
	}

	public void setArchivosTipos(ArchivosTipos archivosTipos) {
		this.archivosTipos = archivosTipos;
	}

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Date getFechaFtp() {
		return fechaFtp;
	}

	public void setFechaFtp(Date fechaFtp) {
		this.fechaFtp = fechaFtp;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Set getProcesosDetalles() {
		return procesosDetalles;
	}

	public void setProcesosDetalles(Set procesosDetalles) {
		this.procesosDetalles = procesosDetalles;
	}
}
