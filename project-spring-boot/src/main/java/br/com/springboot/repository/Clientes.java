package br.com.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Cliente;
import br.com.springboot.repository.helper.cliente.ClientesQueries;

public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries {

	public Optional<Cliente> findByCpfOuCnpj(String cpfOuCnpj);

	public List<Cliente> findByNomeStartingWithIgnoreCase(String nome);

}
