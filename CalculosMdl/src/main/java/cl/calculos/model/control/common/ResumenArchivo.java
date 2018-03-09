package cl.calculos.model.control.common;

import java.io.Serializable;
import java.util.Date;

public class ResumenArchivo implements Serializable{

	private static final long serialVersionUID = -3776666486239111464L;
	private int id;
	private String tipo;
	private String nombre;
	private Integer version;
	private Date fecha;
	private String estado;
	
	public ResumenArchivo() {
		super();
	}

	public ResumenArchivo(int id, String tipo, String nombre, Integer version, Date fecha, String estado) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.version = version;
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
