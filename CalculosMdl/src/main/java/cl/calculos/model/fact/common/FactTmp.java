package cl.calculos.model.fact.common;

public class FactTmp implements java.io.Serializable {
	
	private static final long serialVersionUID = -3515291025977984545L;
	private int factTmpId;
	private int rbdId;
	private int rbd;
	private int operadoraId;
	private String anio;
	private String mes;
	private Integer conexionId;
	private Integer adjudicacionId;
	private Integer mineducId;
	private Boolean enPrefactura;
	private Boolean enResumenDispo;
	private Boolean enResumenVel;
	private Boolean bitacoraAprob;

	public FactTmp() {
	}

	public FactTmp(int rbdId, int rbd, int operadoraId, String anio, String mes) {
		this.rbdId = rbdId;
		this.rbd = rbd;
		this.operadoraId = operadoraId;
		this.anio = anio;
		this.mes = mes;
	}

	public FactTmp(int rbdId, int rbd, int operadoraId, String anio, String mes, Integer conexionId,
			Integer adjudicacionId, Integer mineducId) {
		this.rbdId = rbdId;
		this.rbd = rbd;
		this.operadoraId = operadoraId;
		this.anio = anio;
		this.mes = mes;
		this.conexionId = conexionId;
		this.adjudicacionId = adjudicacionId;
		this.mineducId = mineducId;
	}

	public int getFactTmpId() {
		return this.factTmpId;
	}

	public void setFactTmpId(int factTmpId) {
		this.factTmpId = factTmpId;
	}

	public int getRbdId() {
		return this.rbdId;
	}

	public void setRbdId(int rbdId) {
		this.rbdId = rbdId;
	}

	public int getRbd() {
		return this.rbd;
	}

	public void setRbd(int rbd) {
		this.rbd = rbd;
	}

	public int getOperadoraId() {
		return this.operadoraId;
	}

	public void setOperadoraId(int operadoraId) {
		this.operadoraId = operadoraId;
	}

	public String getAnio() {
		return this.anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Integer getConexionId() {
		return this.conexionId;
	}

	public void setConexionId(Integer conexionId) {
		this.conexionId = conexionId;
	}

	public Integer getAdjudicacionId() {
		return this.adjudicacionId;
	}

	public void setAdjudicacionId(Integer adjudicacionId) {
		this.adjudicacionId = adjudicacionId;
	}

	public Integer getMineducId() {
		return this.mineducId;
	}

	public void setMineducId(Integer mineducId) {
		this.mineducId = mineducId;
	}

	public Boolean getEnPrefactura() {
		return this.enPrefactura;
	}

	public void setEnPrefactura(Boolean enPrefactura) {
		this.enPrefactura = enPrefactura;
	}

	public Boolean getEnResumenDispo() {
		return this.enResumenDispo;
	}

	public void setEnResumenDispo(Boolean enResumenDispo) {
		this.enResumenDispo = enResumenDispo;
	}

	public Boolean getEnResumenVel() {
		return this.enResumenVel;
	}

	public void setEnResumenVel(Boolean enResumenVel) {
		this.enResumenVel = enResumenVel;
	}

	public Boolean getBitacoraAprob() {
		return this.bitacoraAprob;
	}

	public void setBitacoraAprob(Boolean bitacoraAprob) {
		this.bitacoraAprob = bitacoraAprob;
	}
}
