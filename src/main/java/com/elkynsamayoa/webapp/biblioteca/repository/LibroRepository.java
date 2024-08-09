package com.elkynsamayoa.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkynsamayoa.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
