package com.prograiv.apoloClinic.entidades;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private int idUsuario;
	
	@Column(name="cedula", length=20, unique=true)
	private String cedula;
	
	@Column(name="nombres", length=50)
	private String nombres;
	
	@Column(name="apellidos", length=50)
	private String apellidos;

	@Column(name="sexo", length=10)
	private String sexo;
	
	@Column(name="fechaNacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name="direccionNacimiento", length=400)
	private String direccionNacimiento;
	
	@Column(name="direccionActual", length=400)
	private String direccionActual;
	
	@Column(name="telefono")
	private Integer telefono;
	
	@Column(name="especialidad", length=50)
	private String especialidad;
	
	@Column(name="username", length=100)
	private String username;
	
	@Column(name="passw")
	private String passw;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable( name="usuarios_roles",
				joinColumns = @JoinColumn( name="idUsuario", referencedColumnName="idUsuario" ),
				inverseJoinColumns = @JoinColumn( name="idRol", referencedColumnName="idRol" ))
	private List<Rol> roles = new ArrayList<>();

	@OneToMany(mappedBy="usuario")
	private List<visitaPaciente> visitas;
	
	@OneToMany(mappedBy="cedulaMedico")
	private List<Cita> citaMedico;
	
	@OneToMany(mappedBy="idPaciente")
	private List<Cita> citaPaciente;

	@OneToMany(mappedBy="cedulaMedico")
	private List<Consulta> consultaMedico;
	
	@OneToMany(mappedBy="idPaciente")
	private List<Consulta> consultaPaciente;
	
	public Usuario() {

	}
	
	public Usuario(String cedula, String nombres, String apellidos, String sexo, Date fechaNacimiento, String direccionNacimiento, String direccionActual, Integer telefono, String especialidad, String username, String passw, List<Rol> roles, List<visitaPaciente> visitas) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionNacimiento = direccionNacimiento;
		this.direccionActual = direccionActual;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.username = username;
		this.passw = passw;
		this.roles = roles;
		this.visitas = visitas;
	}
	
	public Usuario(int idUsuario, String cedula, String nombres, String apellidos, String sexo, Date fechaNacimiento, String direccionNacimiento, String direccionActual, Integer telefono, String especialidad, String username, String passw, List<Rol> roles, List<visitaPaciente> visitas) {
		this.idUsuario = idUsuario;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionNacimiento = direccionNacimiento;
		this.direccionActual = direccionActual;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.username = username;
		this.passw = passw;
		this.roles = roles;
		this.visitas = visitas;
	}

	public List<visitaPaciente> getVisitas() {
		return visitas;
	}

	public void setVisitas(List<visitaPaciente> visitas) {
		this.visitas = visitas;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
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