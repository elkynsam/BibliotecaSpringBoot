package com.elkynsamayoa.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkynsamayoa.webapp.biblioteca.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{

}
