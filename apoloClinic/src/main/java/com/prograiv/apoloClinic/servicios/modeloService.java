package com.prograiv.apoloClinic.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prograiv.apoloClinic.entidades.Usuario;
import com.prograiv.apoloClinic.repositorios.visitaRepo;

@Service
public class modeloService implements visitaService{

	@Autowired
	private visitaRepo visiRepo;
	
	
	
	@Override
	public List<Usuario> buscarPorNombres(String nombres) {
		
		
	
		return visiRepo.findByNombres(nombres);
	}
	

}
