package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Grupo;

public interface Grupos extends JpaRepository<Grupo, Long> {

}
