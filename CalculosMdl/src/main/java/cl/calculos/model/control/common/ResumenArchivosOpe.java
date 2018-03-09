package cl.calculos.model.control.common;

import java.math.BigInteger;

public class ResumenArchivosOpe {
	
	private Integer operadora;
	private BigInteger archivos;
	
	public ResumenArchivosOpe() {
		super();
	}

	public ResumenArchivosOpe(Integer operadora, BigInteger archivos) {
		super();
		this.operadora = operadora;
		this.archivos = archivos;
	}

	public Integer getOperadora() {
		return operadora;
	}

	public void setOperadora(Integer operadora) {
		this.operadora = operadora;
	}

	public BigInteger getArchivos() {
		return archivos;
	}

	public void setArchivos(BigInteger archivos) {
		this.archivos = archivos;
	}
}
