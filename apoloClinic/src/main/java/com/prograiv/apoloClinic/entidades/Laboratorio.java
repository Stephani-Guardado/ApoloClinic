package com.prograiv.apoloClinic.entidades;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="laboratorio")
public class Laboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idLaboratorio")
	private int idLaboratorio;
	
	@Column(name="nombre", length=200)
	private String nombre;
	
	@OneToMany(mappedBy="laboratorio")
	private List<Medicamento> medicamentos;

	public Laboratorio() {
		
	}
	
	public Laboratorio(String nombre) {
		this.nombre = nombre;
	}
	
	public Laboratorio(int idLaboratorio, String nombre) {
		this.idLaboratorio = idLaboratorio;
		this.nombre = nombre;
	}
	
	public int getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
}