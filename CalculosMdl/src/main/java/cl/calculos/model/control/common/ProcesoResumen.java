package cl.calculos.model.control.common;

import java.util.Date;

public class ProcesoResumen implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String proceso;
	private Integer operadora;
	private String mes;
	private String ano;
	private Integer usuario;
	private Date fecha;
	private Integer estado;
	
	public ProcesoResumen() {
		super();
	}

	public ProcesoResumen(Integer id, String proceso, Integer operadora, String mes, String ano, Integer usuario,
			Date fecha, Integer estado) {
		super();
		this.id = id;
		this.proceso = proceso;
		this.operadora = operadora;
		this.mes = mes;
		this.ano = ano;
		this.usuario = usuario;
		this.fecha = fecha;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProceso() {
		return proceso;
	}

	public void setProceso(String proceso) {
		this.proceso = proceso;
	}

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}
