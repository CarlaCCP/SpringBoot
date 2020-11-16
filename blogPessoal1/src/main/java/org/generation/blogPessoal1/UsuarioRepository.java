package org.generation.blogPessoal1;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario , Long> {
	
	public Optional<Usuario> findByUsuario(String Usuario);
	
}
