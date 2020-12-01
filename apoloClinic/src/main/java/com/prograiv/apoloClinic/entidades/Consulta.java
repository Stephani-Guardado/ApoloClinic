package com.prograiv.apoloClinic.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idConsulta")
	private int idConsulta;
	
	@Column(name="sintomas", length=900)
	private String sintomas;
	
	@Column(name="diagnostico", length=900)
	private String diagnostico;
	
	@Column(name="observaciones", length=900)
	private String observaciones;
	
	@ManyToOne
	@JoinColumn(name="idCita")
	private Cita cita;
	
	@ManyToOne
	@JoinColumn(name="cedula")
	private Usuario cedulaMedico;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario idPaciente;
	
	@OneToMany(mappedBy="consulta")
	private List<Receta> receta;

	public Consulta() {
		
	}
	
	public Consulta(String sintomas, String diagnostico, String observaciones, Cita cita, Usuario cedulaMedico, Usuario idPaciente) {
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.observaciones = observaciones;
		this.cita = cita;
		this.cedulaMedico = cedulaMedico;
		this.idPaciente = idPaciente;
	}
	
	public Consulta(int idConsulta, String sintomas, String diagnostico, String observaciones, Cita cita, Usuario cedulaMedico, Usuario idPaciente) {
		this.idConsulta = idConsulta;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.observaciones = observaciones;
		this.cita = cita;
		this.cedulaMedico = cedulaMedico;
		this.idPaciente = idPaciente;
	}

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public Usuario getCedulaMedico() {
		return cedulaMedico;
	}

	public void setCedulaMedico(Usuario cedulaMedico) {
		this.cedulaMedico = cedulaMedico;
	}

	public Usuario getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Usuario idPaciente) {
		this.idPaciente = idPaciente;
	}
}