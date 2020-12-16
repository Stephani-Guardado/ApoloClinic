package com.prograiv.apoloClinic.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import com.prograiv.apoloClinic.entidades.Usuario;
import com.prograiv.apoloClinic.repositorios.RepoV;
import com.prograiv.apoloClinic.servicios.visitaService;

@Controller
public class visitaController {

	@Autowired
	private visitaService visiServi;
	@Autowired
	private RepoV rv;
	
	
	 @GetMapping("/visi") 
	 public String visi(Model m) {
	 m.addAttribute("listavisita", rv.findAll()); 
	 return "visiform"; }
	 
	
	@GetMapping("/visiform")
	public String visiform(Model model) {
		model.addAttribute("visitasPa", new Usuario());
		
		return "visiform";
	}
	
	
	@GetMapping("/pascientesEnfer")
	public String pascientesEnfer() {
		return "/pascientesEnfer";
	}
	
	
	@GetMapping("/nombre")
	public String buscarPorNombre(@RequestParam String nombres , Model model , @ModelAttribute("visitasPa") Usuario usua) {
		model.addAttribute("usuaPorNombre", visiServi.buscarPorNombres(nombres));
		
		return "visiform";
	}
}
