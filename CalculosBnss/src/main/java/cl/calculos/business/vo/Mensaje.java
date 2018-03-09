package cl.calculos.business.vo;

public class Mensaje {
	private Boolean calculado;
	private String mensaje;
	
	public Mensaje() {
		super();
	}

	public Mensaje(Boolean calculado, String mensaje) {
		super();
		this.calculado = calculado;
		this.mensaje = mensaje;
	}

	public Boolean getCalculado() {
		return calculado;
	}

	public void setCalculado(Boolean calculado) {
		this.calculado = calculado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
