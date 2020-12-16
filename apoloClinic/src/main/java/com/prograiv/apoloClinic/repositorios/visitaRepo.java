package com.prograiv.apoloClinic.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prograiv.apoloClinic.entidades.Usuario;

@Repository
public interface visitaRepo  extends JpaRepository<Usuario, Integer>{
	
//bucar pacientes por nombres
	List<Usuario>findByNombres(String nombres);
}
