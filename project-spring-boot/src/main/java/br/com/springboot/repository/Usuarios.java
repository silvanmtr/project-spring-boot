package br.com.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Usuario;
import br.com.springboot.repository.helper.usuario.UsuariosQueries;

public interface Usuarios extends JpaRepository<Usuario, Long>, UsuariosQueries {

	public Optional<Usuario> findByEmail(String email);

	public List<Usuario> findByCodigoIn(Long[] codigos);

}
