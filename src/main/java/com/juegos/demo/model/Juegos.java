package com.juegos.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Juegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String desarrollador;

    @Column(nullable = false)
    private Date fechaPublicacion;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private int precio;
    
}
