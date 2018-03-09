package cl.calculos.model.web.common;

import java.util.Date;

public class Contactos implements java.io.Serializable {

	private static final long serialVersionUID = -506428280858513139L;
	private int contactoId;
	private Rbd rbd;
	private String nombreTx;
	private String cargoTx;
	private String telefono1Tx;
	private String telefono2Tx;
	private String mailTx;
	private Date fechaBaja;

	public Contactos() {
	}

	public Contactos(int contactoId) {
		this.contactoId = contactoId;
	}

	public Contactos(int contactoId, Rbd rbd, String nombreTx, String cargoTx, String telefono1Tx, String telefono2Tx,
			String mailTx, Date fechaBaja) {
		this.contactoId = contactoId;
		this.rbd = rbd;
		this.nombreTx = nombreTx;
		this.cargoTx = cargoTx;
		this.telefono1Tx = telefono1Tx;
		this.telefono2Tx = telefono2Tx;
		this.mailTx = mailTx;
		this.fechaBaja = fechaBaja;
	}

	public int getContactoId() {
		return this.contactoId;
	}

	public void setContactoId(int contactoId) {
		this.contactoId = contactoId;
	}

	public Rbd getRbd() {
		return this.rbd;
	}

	public void setRbd(Rbd rbd) {
		this.rbd = rbd;
	}

	public String getNombreTx() {
		return this.nombreTx;
	}

	public void setNombreTx(String nombreTx) {
		this.nombreTx = nombreTx;
	}

	public String getCargoTx() {
		return this.cargoTx;
	}

	public void setCargoTx(String cargoTx) {
		this.cargoTx = cargoTx;
	}

	public String getTelefono1Tx() {
		return this.telefono1Tx;
	}

	public void setTelefono1Tx(String telefono1Tx) {
		this.telefono1Tx = telefono1Tx;
	}

	public String getTelefono2Tx() {
		return this.telefono2Tx;
	}

	public void setTelefono2Tx(String telefono2Tx) {
		this.telefono2Tx = telefono2Tx;
	}

	public String getMailTx() {
		return this.mailTx;
	}

	public void setMailTx(String mailTx) {
		this.mailTx = mailTx;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

}
