package com.prograiv.apoloClinic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograiv.apoloClinic.entidades.visitaPaciente;

public interface RepoV extends JpaRepository<visitaPaciente, Integer> {

}
