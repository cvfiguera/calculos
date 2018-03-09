package cl.calculos.model.control.common;

import java.util.Date;

public class ArchivoVersion implements java.io.Serializable {
	
	private static final long serialVersionUID = -1734256601322364378L;
	private Integer id;
	private Integer tipoid;
	private String tipo;
	private String nombre;
	private Integer version;
	private Integer operadora;
	private Date fecha;
	private String ruta;
	
	public ArchivoVersion() {
		super();
	}

	public ArchivoVersion(Integer id, Integer tipoid, String tipo, String nombre, Integer version, Integer operadora,
			Date fecha, String ruta) {
		super();
		this.id = id;
		this.tipoid = tipoid;
		this.tipo = tipo;
		this.nombre = nombre;
		this.version = version;
		this.operadora = operadora;
		this.fecha = fecha;
		this.ruta = ruta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTipoid() {
		return tipoid;
	}

	public void setTipoid(Integer tipoid) {
		this.tipoid = tipoid;
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

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
