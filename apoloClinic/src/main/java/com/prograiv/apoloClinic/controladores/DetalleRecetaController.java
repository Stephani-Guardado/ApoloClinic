package com.prograiv.apoloClinic.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prograiv.apoloClinic.entidades.Consulta;
import com.prograiv.apoloClinic.entidades.RecetaDetalles;
import com.prograiv.apoloClinic.repositorios.DetalleResetaRepo;
import com.prograiv.apoloClinic.repositorios.RecetaRepo;

@Controller
public class DetalleRecetaController {
	
	@Autowired
	private DetalleResetaRepo drr;
	
	@GetMapping("/detalleres")
	public String recetadetalle() {
		return "Receta";
	}
	@PostMapping("/save-recetadetalle")
	public String registro(@ModelAttribute  RecetaDetalles re/*, Model m*/) {
		//c.setCedulaMedico(cedulaMedico.concat(c.getCedulaMedico()));
		drr.save(re);
		//m.addAttribute("RegistroConsulta", cr.findAll());
		return "index";
	}
	

}
