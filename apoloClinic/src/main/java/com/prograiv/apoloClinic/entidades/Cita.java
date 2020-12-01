package com.prograiv.apoloClinic.entidades;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cita")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCita")
	private int idCita;
	
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(name="hora")
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@Column(name="asunto", length=150)
	private String asunto;
	
	@Column(name="descripcion", length=500)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="idEstadoCita")
	private EstadoCita estadoCita;
	
	@ManyToOne
	@JoinColumn(name="cedula")
	private Usuario cedulaMedico;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario idPaciente;
	
	@OneToMany(mappedBy="cita")
	private List<Consulta> consulta;
}
