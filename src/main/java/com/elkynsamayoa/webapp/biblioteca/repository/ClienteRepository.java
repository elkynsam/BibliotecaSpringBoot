package com.elkynsamayoa.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkynsamayoa.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
