package com.prograiv.apoloClinic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograiv.apoloClinic.entidades.Consulta;

public interface ConsultaRepo extends JpaRepository<Consulta, Integer> {

}
