package com.prograiv.apoloClinic.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.prograiv.apoloClinic.entidades.Consulta;
import com.prograiv.apoloClinic.entidades.Receta;
import com.prograiv.apoloClinic.entidades.Usuario;
import com.prograiv.apoloClinic.repositorios.ConsultaRepo;

import com.prograiv.apoloClinic.repositorios.RecetaRepo;
import com.prograiv.apoloClinic.repositorios.UsuarioRepo;

@Controller
public class ConsultaController {

	@Autowired
	private ConsultaRepo cr;
	@Autowired
	private RecetaRepo rr;
	@Autowired
	//private UsuarioRepo ur;
	
	@GetMapping("/consu")
	public String consulta() {
		return "DocConsulta";
	}
	//-------------------------------------------------------------------
	@GetMapping("/rece")
	public String receta() {
		return "DocConsulta";
	}
	
	/*@GetMapping("/vista-doctors")
	public String adminDoc() {
		return "admDocs";
	}*/
	
	@PostMapping("/save-receta")
	public String registroR(@ModelAttribute  Receta c/*, Model m*/) {
		//c.setCedulaMedico(cedulaMedico.concat(c.getCedulaMedico()));
		rr.save(c);
		//m.addAttribute("RegistroConsulta", cr.findAll());
		return "Receta";
	}
	//---------------------------------------------------------------------
	@PostMapping("/save-consulta")
	public String registro(@ModelAttribute  Consulta c/*, Usuario u*//*, Model m*/) {
		//String cedulaMdc = "";
		//c.setCedulaMedico(cedulaMedico.concat(c.getCedulaMedico()));
		//u.setCedula(cedulaMdc.concat(u.getCedula()));
		//ur.save(u);
		cr.save(c);
		//m.addAttribute("RegistroConsulta", cr.findAll());
		return "Receta";
	}
	
	
	
	
	
}