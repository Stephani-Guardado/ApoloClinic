package com.prograiv.apoloClinic.entidades;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="visitaPaciente")
public class visitaPaciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idVisita")
	private int idVisita;
	
	@Column(name="fecha", length=20)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(name="hora")
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@Column(name="peso")
	private Double peso;
	
	@Column(name="altura")
	private Double altura;
	
	@Column(name="sintomas", length=500)
	private String sintomas;
	
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario usuario;
	
	public visitaPaciente() {
		
	}
	
	public visitaPaciente(Date fecha, Date hora, Double peso, Double altura, String sintomas, Usuario usuario) {
		this.fecha = fecha;
		this.hora = hora;
		this.peso = peso;
		this.altura = altura;
		this.sintomas = sintomas;
		this.usuario = usuario;
	}

	public visitaPaciente(int idVisita, Date fecha, Date hora, Double peso, Double altura, String sintomas, Usuario usuario) {
		this.idVisita = idVisita;
		this.fecha = fecha;
		this.hora = hora;
		this.peso = peso;
		this.altura = altura;
		this.sintomas = sintomas;
		this.usuario = usuario;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}