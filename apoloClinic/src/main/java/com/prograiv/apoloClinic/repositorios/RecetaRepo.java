package com.prograiv.apoloClinic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograiv.apoloClinic.entidades.Receta;

public interface RecetaRepo extends JpaRepository<Receta, Integer>{

}