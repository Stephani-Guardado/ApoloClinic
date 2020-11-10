package com.prograiv.apoloClinic.controladores;
import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login( @RequestParam(value="error", required=false) String error,
						 @RequestParam(value="logout", required=false) String logout,
						 Model m, Principal p, RedirectAttributes flash) {
		
		if(p != null) {
			flash.addAttribute("inf", "La sesión ya se encuentra activada.");
		}
		if(error != null) {
			m.addAttribute("error", "Los datos ingresados son incorrectos.");
		}
		if(logout != null) {
			m.addAttribute("logout", "La sesión ha finalizado exitosamente.");
		}
		
		return "login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		
		return "redirect:/login?logout";
	}
}
