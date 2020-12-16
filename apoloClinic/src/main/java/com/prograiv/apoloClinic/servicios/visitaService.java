package com.prograiv.apoloClinic.servicios;

import java.util.List;

import com.prograiv.apoloClinic.entidades.Usuario;


public interface visitaService {

	List<Usuario>buscarPorNombres(String nombres);
}
