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
@Table(name="medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idMedicamento")
	private int idMedicamento;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fecha_registro")
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;
	
	@Column(name="fecha_vence")
	@Temporal(TemporalType.DATE)
	private Date fecha_vence;
	
	@ManyToOne
	@JoinColumn(name="idLaboratorio", nullable=false)
	private Laboratorio laboratorio;
	
	@OneToMany(mappedBy="medicamento")
	private List<Farmacia> farmacia; 
	
	@OneToMany(mappedBy="medicamento")
	private List<RecetaDetalles> recetaDetalles;
	
	public Medicamento() {
		
	}
	
	public Medicamento(String nombre, String descripcion, Date fecha_registro, Date fecha_vence, Laboratorio laboratorio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_registro = fecha_registro;
		this.fecha_vence = fecha_vence;
		this.laboratorio = laboratorio;
	}
	
	public Medicamento(int idMedicamento, String nombre, String descripcion, Date fecha_registro, Date fecha_vence, Laboratorio laboratorio) {
		this.idMedicamento = idMedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_registro = fecha_registro;
		this.fecha_vence = fecha_vence;
		this.laboratorio = laboratorio;
	}

	public int getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Date getFecha_vence() {
		return fecha_vence;
	}

	public void setFecha_vence(Date fecha_vence) {
		this.fecha_vence = fecha_vence;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
}