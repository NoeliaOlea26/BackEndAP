/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Noelia Olea
 */
@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue
    (strategy = GenerationType.AUTO)
    private Long id;
    private String escuela;
    private String titulo;
    private String inicio;
    private String fin;
    private String logo;

    public Educacion(String escuela, String titulo, String inicio, String fin, String logo) {
        this.escuela = escuela;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.logo = logo;
    }

    public Educacion() {
    }
}
