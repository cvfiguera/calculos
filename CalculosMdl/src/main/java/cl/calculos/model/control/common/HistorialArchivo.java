package cl.calculos.model.control.common;

import java.util.Date;

public class HistorialArchivo {
	
	private int id;
	private String nombre;
	private Date fecha;
	private String estado;
	private Integer usuario;
	
	public HistorialArchivo() {
		super();
	}

	public HistorialArchivo(int id, String nombre, Date fecha, String estado, Integer usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.estado = estado;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
}
