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
@Table(name="receta")
public class Receta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idReceta")
	private int idReceta;
	
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="idConsulta")
	private Consulta consulta;
	
	@OneToMany(mappedBy="receta")
	private List<RecetaDetalles> recetaDetalles;

	public Receta() {
		
	}
	
	public Receta(Date fecha, Consulta consulta) {
		this.fecha = fecha;
		this.consulta = consulta;
	}
	
	public Receta(int idReceta, Date fecha, Consulta consulta) {
		this.idReceta = idReceta;
		this.fecha = fecha;
		this.consulta = consulta;
	}

	public int getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
}