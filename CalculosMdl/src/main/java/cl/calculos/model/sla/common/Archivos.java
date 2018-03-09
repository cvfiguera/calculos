package cl.calculos.model.sla.common;

import java.util.Date;

public class Archivos implements java.io.Serializable {

	private static final long serialVersionUID = 5334671243546303480L;
	private int archivoId;
	private String nombreArchivoTx;
	private Integer versionNu;
	private Date fechaProcesamientoFe;
	private Integer archivoControlId;
	private Integer operadora;
	
	public Archivos() {
		super();
	}

	public Archivos(String nombreArchivoTx, Integer versionNu, Date fechaProcesamientoFe,
			Integer archivoControlId, Integer operadora) {
		super();
		this.nombreArchivoTx = nombreArchivoTx;
		this.versionNu = versionNu;
		this.fechaProcesamientoFe = fechaProcesamientoFe;
		this.archivoControlId = archivoControlId;
		this.operadora = operadora;
	}

	public int getArchivoId() {
		return archivoId;
	}

	public void setArchivoId(int archivoId) {
		this.archivoId = archivoId;
	}

	public String getNombreArchivoTx() {
		return nombreArchivoTx;
	}

	public void setNombreArchivoTx(String nombreArchivoTx) {
		this.nombreArchivoTx = nombreArchivoTx;
	}

	public Integer getVersionNu() {
		return versionNu;
	}

	public void setVersionNu(Integer versionNu) {
		this.versionNu = versionNu;
	}

	public Date getFechaProcesamientoFe() {
		return fechaProcesamientoFe;
	}

	public void setFechaProcesamientoFe(Date fechaProcesamientoFe) {
		this.fechaProcesamientoFe = fechaProcesamientoFe;
	}

	public Integer getArchivoControlId() {
		return archivoControlId;
	}

	public void setArchivoControlId(Integer archivoControlId) {
		this.archivoControlId = archivoControlId;
	}

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}	
}
