package com.prograiv.apoloClinic.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recetaDetalles")
public class RecetaDetalles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idRecetaDetalles")
	private int idRecetaDetalles;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="estado")
	private Integer estado;
	
	@ManyToOne
	@JoinColumn(name="idReceta")
	private Receta receta;
	
	@ManyToOne
	@JoinColumn(name="idMedicamento")
	private Medicamento medicamento;
	
	public RecetaDetalles() {
		
	}

	public RecetaDetalles(Integer cantidad, Integer estado, Receta receta, Medicamento medicamento) {
		this.cantidad = cantidad;
		this.estado = estado;
		this.receta = receta;
		this.medicamento = medicamento;
	}
	
	public RecetaDetalles(int idRecetaDetalles, Integer cantidad, Integer estado, Receta receta, Medicamento medicamento) {
		this.idRecetaDetalles = idRecetaDetalles;
		this.cantidad = cantidad;
		this.estado = estado;
		this.receta = receta;
		this.medicamento = medicamento;
	}

	public int getIdRecetaDetalles() {
		return idRecetaDetalles;
	}

	public void setIdRecetaDetalles(int idRecetaDetalles) {
		this.idRecetaDetalles = idRecetaDetalles;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
}
