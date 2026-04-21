package com.juegos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegos.demo.model.Juegos;

public interface JuegosRepository extends JpaRepository<Juegos, Long>{
    
}
