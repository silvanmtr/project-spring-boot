package br.com.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Cidade;
import br.com.springboot.model.Estado;
import br.com.springboot.repository.helper.cidade.CidadesQueries;

public interface Cidades extends JpaRepository<Cidade, Long>, CidadesQueries {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

	public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
	
}
