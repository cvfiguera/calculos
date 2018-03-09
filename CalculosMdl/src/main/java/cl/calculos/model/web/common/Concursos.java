package cl.calculos.model.web.common;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Concursos implements java.io.Serializable {

	private static final long serialVersionUID = 1462503033559491252L;
	private int concursoId;
	private String nombre;
	private Date fechaInicio;
	private Date fechaTermino;
	private String comentarios;
	private Set rbdConcursoses = new HashSet(0);

	public Concursos() {
	}

	public Concursos(int concursoId) {
		this.concursoId = concursoId;
	}

	public Concursos(int concursoId, String nombre, Date fechaInicio, Date fechaTermino, String comentarios,
			Set rbdConcursoses) {
		this.concursoId = concursoId;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.comentarios = comentarios;
		this.rbdConcursoses = rbdConcursoses;
	}

	public int getConcursoId() {
		return this.concursoId;
	}

	public void setConcursoId(int concursoId) {
		this.concursoId = concursoId;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Set getRbdConcursoses() {
		return this.rbdConcursoses;
	}

	public void setRbdConcursoses(Set rbdConcursoses) {
		this.rbdConcursoses = rbdConcursoses;
	}

}
