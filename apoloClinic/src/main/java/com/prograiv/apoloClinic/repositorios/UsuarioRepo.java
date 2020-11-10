package com.prograiv.apoloClinic.repositorios;
import com.prograiv.apoloClinic.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

	public Usuario findByUsername(String username);
}

