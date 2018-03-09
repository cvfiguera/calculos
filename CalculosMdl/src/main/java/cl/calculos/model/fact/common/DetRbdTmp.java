package cl.calculos.model.fact.common;

import java.math.BigDecimal;
import java.util.Date;

public class DetRbdTmp implements java.io.Serializable {

	private static final long serialVersionUID = 7878905005060499534L;
	private int detRbdTmp;
	private FactTmp factTmp;
	private Integer rbdId;
	private Integer NMuestra;
	private Date fechaHora;
	private Integer dispo;
	private BigDecimal VBajada;
	private BigDecimal VSubida;
	private Boolean feriado;
	private Boolean bitacora;

	public DetRbdTmp() {
	}

	public DetRbdTmp(int detRbdTmp) {
		this.detRbdTmp = detRbdTmp;
	}

	public DetRbdTmp(FactTmp factTmp, Integer rbdId, Integer NMuestra, Date fechaHora) {
		this.factTmp = factTmp;
		this.rbdId = rbdId;
		this.NMuestra = NMuestra;
		this.fechaHora = fechaHora;
	}

	public DetRbdTmp(FactTmp factTmp, Integer rbdId, Integer nMuestra, Date fechaHora, Integer dispo,
			BigDecimal vBajada, BigDecimal vSubida, Boolean feriado, Boolean bitacora) {
		super();
		this.factTmp = factTmp;
		this.rbdId = rbdId;
		NMuestra = nMuestra;
		this.fechaHora = fechaHora;
		this.dispo = dispo;
		VBajada = vBajada;
		VSubida = vSubida;
		this.feriado = feriado;
		this.bitacora = bitacora;
	}

	public int getDetRbdTmp() {
		return this.detRbdTmp;
	}

	public void setDetRbdTmp(int detRbdTmp) {
		this.detRbdTmp = detRbdTmp;
	}

	public FactTmp getFactTmp() {
		return this.factTmp;
	}

	public void setFactTmp(FactTmp factTmp) {
		this.factTmp = factTmp;
	}

	public Integer getRbdId() {
		return this.rbdId;
	}

	public void setRbdId(Integer rbdId) {
		this.rbdId = rbdId;
	}

	public Integer getNMuestra() {
		return this.NMuestra;
	}

	public void setNMuestra(Integer NMuestra) {
		this.NMuestra = NMuestra;
	}

	public Date getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Integer getDispo() {
		return this.dispo;
	}

	public void setDispo(Integer dispo) {
		this.dispo = dispo;
	}

	public BigDecimal getVBajada() {
		return this.VBajada;
	}

	public void setVBajada(BigDecimal VBajada) {
		this.VBajada = VBajada;
	}

	public BigDecimal getVSubida() {
		return this.VSubida;
	}

	public void setVSubida(BigDecimal VSubida) {
		this.VSubida = VSubida;
	}

	public Boolean getFeriado() {
		return this.feriado;
	}

	public void setFeriado(Boolean feriado) {
		this.feriado = feriado;
	}

	public Boolean getBitacora() {
		return this.bitacora;
	}

	public void setBitacora(Boolean bitacora) {
		this.bitacora = bitacora;
	}

}
