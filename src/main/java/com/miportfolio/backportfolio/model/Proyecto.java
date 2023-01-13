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
public class Proyecto {
    @Id
    @GeneratedValue
    (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String anio;
    private String descripcion;
    private String link;
    private String captura;

    public Proyecto(String nombre, String anio, String descripcion, String link, String captura) {
        this.nombre = nombre;
        this.anio = anio;
        this.descripcion = descripcion;
        this.link = link;
        this.captura = captura;
    }

    public Proyecto() {
    }
}
