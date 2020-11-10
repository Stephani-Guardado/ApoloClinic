package com.prograiv.apoloClinic.servicios;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.prograiv.apoloClinic.entidades.Rol;
import com.prograiv.apoloClinic.entidades.Usuario;

public class MiUsuarioDetails implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private Usuario u;
	
	public MiUsuarioDetails(Usuario user) {
		this.u = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		
		for(Rol rol:this.u.getRoles()) {
			auth.add(new SimpleGrantedAuthority(rol.getRol()));
		}
		
		return auth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.u.getPassw();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.u.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}