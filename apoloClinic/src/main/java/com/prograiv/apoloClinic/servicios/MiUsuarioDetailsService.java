package com.prograiv.apoloClinic.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prograiv.apoloClinic.entidades.Usuario;
import com.prograiv.apoloClinic.repositorios.UsuarioRepo;

@Service
@Transactional(readOnly = true)
public class MiUsuarioDetailsService implements UserDetailsService{

	@Autowired
	UsuarioRepo ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario u = ur.findByUsername(username);
		MiUsuarioDetails ud;
		
		if(u == null) {
			throw new UsernameNotFoundException("No se encontró el usuario '" + username + "'...");
		} else {
			ud = new MiUsuarioDetails(u);
		}
		
		return ud;
	}

}
