package com.prograiv.apoloClinic.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadoCita")
public class EstadoCita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEstadoCita")
	private int idEstadoCita;
	
	@Column(name="nombre", length=200)
	private String nombre;

	public EstadoCita() {
		
	}
	
	public EstadoCita(String nombre) {
		this.nombre = nombre;
	}
	
	public EstadoCita(int idEstadoCita, String nombre) {
		this.idEstadoCita = idEstadoCita;
		this.nombre = nombre;
	}

	public int getIdEstadoCita() {
		return idEstadoCita;
	}

	public void setIdEstadoCita(int idEstadoCita) {
		this.idEstadoCita = idEstadoCita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
