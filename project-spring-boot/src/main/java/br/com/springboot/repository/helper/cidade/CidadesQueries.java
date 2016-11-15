package br.com.springboot.repository.helper.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.springboot.model.Cidade;
import br.com.springboot.repository.filter.CidadeFilter;

public interface CidadesQueries {

	public Page<Cidade> filtrar(CidadeFilter filtro, Pageable pageable);
	
}
