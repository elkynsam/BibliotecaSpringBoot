package com.elkynsamayoa.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkynsamayoa.webapp.biblioteca.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}