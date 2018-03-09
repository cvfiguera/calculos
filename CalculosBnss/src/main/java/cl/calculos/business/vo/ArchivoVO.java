package cl.calculos.business.vo;


public class ArchivoVO {
	
	private Integer id;
	private Integer codtipo;
	private String tipo;
	private String nombre;
	private Integer version;
	private String fecha;
	private Integer codestado;
	private String estado;
	
	public ArchivoVO() {
		super();
	}

	public ArchivoVO(Integer id, Integer codtipo, String tipo, String nombre, Integer version, String fecha,
			Integer codestado, String estado) {
		super();
		this.id = id;
		this.codtipo = codtipo;
		this.tipo = tipo;
		this.nombre = nombre;
		this.version = version;
		this.fecha = fecha;
		this.codestado = codestado;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCodtipo() {
		return codtipo;
	}

	public void setCodtipo(Integer codtipo) {
		this.codtipo = codtipo;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getCodestado() {
		return codestado;
	}

	public void setCodestado(Integer codestado) {
		this.codestado = codestado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
