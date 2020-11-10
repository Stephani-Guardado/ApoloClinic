package com.prograiv.apoloClinic.entidades;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private int idUsuario;
	
	@Column(name="cedula", nullable=true)
	private Integer cedula;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;

	@Column(name="sexo")
	private String sexo;
	
	@Column(name="fechaNacimiento")
	private String fechaNacimiento;
	
	@Column(name="direccionNacimiento")
	private String direccionNacimiento;
	
	@Column(name="direccionActual")
	private String direccionActual;
	
	@Column(name="telefono", nullable=true)
	private Integer telefono;
	
	@Column(name="especialidad")
	private String especialidad;
	
	@Column(name="username")
	private String username;
	
	@Column(name="passw")
	private String passw;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable( name="usuarios_roles",
				joinColumns = @JoinColumn( name="idUsuario", referencedColumnName="idUsuario" ),
				inverseJoinColumns = @JoinColumn( name="idRol", referencedColumnName="idRol" ))
	private List<Rol> roles = new ArrayList<>();

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccionNacimiento() {
		return direccionNacimiento;
	}

	public void setDireccionNacimiento(String direccionNacimiento) {
		this.direccionNacimiento = direccionNacimiento;
	}

	public String getDireccionActual() {
		return direccionActual;
	}

	public void setDireccionActual(String direccionActual) {
		this.direccionActual = direccionActual;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
}
