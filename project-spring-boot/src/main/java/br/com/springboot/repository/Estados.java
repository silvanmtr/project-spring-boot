package br.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.model.Estado;

public interface Estados extends JpaRepository<Estado, Long> {

}
