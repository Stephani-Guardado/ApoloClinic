package com.prograiv.apoloClinic.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prograiv.apoloClinic.entidades.Laboratorio;
import com.prograiv.apoloClinic.entidades.Medicamento;
import com.prograiv.apoloClinic.entidades.Usuario;
import com.prograiv.apoloClinic.repositorios.FarmaciaRepo;
import com.prograiv.apoloClinic.repositorios.LaboratorioRepo;
import com.prograiv.apoloClinic.repositorios.MedicamentoRepo;
import com.prograiv.apoloClinic.repositorios.UsuarioRepo;

@Controller
public class GeneralController {
	
	@Autowired
	private UsuarioRepo ur;
	
	@Autowired
	private MedicamentoRepo mr;
	
	@Autowired
	private LaboratorioRepo lr;
	
	@Autowired
	BCryptPasswordEncoder passEncod;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "perfilAdmin";
	}
	
	@GetMapping("/doctor")
	public String user() {
		return "perfilDoc";
	}
	
	@GetMapping("/nurse")
	public String nurse() {
		return "perfilNurse";
	}
	
	@GetMapping("/paciente")
	public String paciente() {
		return "perfilPaciente";
	}
	
	@GetMapping("/registro")
	public String regPaciente() {
		return "registroPaciente";
	}
	
	@GetMapping("/crud-doctors")
	public String adminDoc() {
		return "admDocs";
	}
	
	@GetMapping("/crud-nurses")
	public String adminNurse() {
		return "admNurses";
	}

	@GetMapping("/crud-farm")
	public String adminFarm(Model m) {
		m.addAttribute("invMedicamentos", mr.findAll());
		m.addAttribute("listaLabs", lr.findAll());
		return "admFarmacia";
	}
	
	@PostMapping("/save-farm")
	public String saveFarm(@ModelAttribute Medicamento md, Model m) {
		mr.save(md);
		m.addAttribute("invMedicamentos", mr.findAll());
		m.addAttribute("listaLabs", lr.findAll());
		return "admFarmacia";
	}
	
	@PostMapping("/save-lab")
	public String saveLab(@ModelAttribute Laboratorio lb, Model m) {
		lr.save(lb);
		m.addAttribute("invMedicamentos", mr.findAll());
		m.addAttribute("listaLabs", lr.findAll());
		return "admFarmacia";
	}
	
	@GetMapping("/error_403")
	public String error403() {
		return "error403";
	}
	
	@PostMapping("/save-paciente")
	public String savePaciente(@ModelAttribute Usuario u) {
		String passEncrypt = passEncod.encode(u.getPassw());
		u.setPassw(passEncrypt);
		ur.save(u);
		return "login";
	}
	
	@PostMapping("/save-doctor")
	public String saveDoc(@ModelAttribute Usuario u) {
		String cedulaMdc = "MDC-";
		String passEncrypt = passEncod.encode(u.getPassw());
		u.setPassw(passEncrypt);
		u.setCedula(cedulaMdc.concat(u.getCedula()));
		ur.save(u);
		return "admDocs";
	}
	
	@PostMapping("/save-nurse")
	public String saveNurse(@ModelAttribute Usuario u) {
		String cedulaMdc = "MDC-";
		String passEncrypt = passEncod.encode(u.getPassw());
		u.setPassw(passEncrypt);
		u.setCedula(cedulaMdc.concat(u.getCedula()));
		ur.save(u);
		return "admNurses";
	}
}

