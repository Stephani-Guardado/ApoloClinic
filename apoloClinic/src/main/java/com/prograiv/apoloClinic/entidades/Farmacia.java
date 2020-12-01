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
@Table(name="farmacia")
public class Farmacia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idFarmacia")
	private int idFarmacia;
	
	@Column(name="stock")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name="idMedicamento", nullable=false)
	private Medicamento medicamento;
	
	public Farmacia() {
		
	}
	
	public Farmacia(int stock, Medicamento medicamento) {
		this.stock = stock;
		this.medicamento = medicamento;
	}
	
	public Farmacia(int idFarmacia, int stock, Medicamento medicamento) {
		this.idFarmacia = idFarmacia;
		this.stock = stock;
		this.medicamento = medicamento;
	}

	public int getIdFarmacia() {
		return idFarmacia;
	}

	public void setIdFarmacia(int idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
}
