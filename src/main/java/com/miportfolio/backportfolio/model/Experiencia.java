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
public class Experiencia {
    @Id
    @GeneratedValue
    (strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    private String inicio;
    private String fin;
    private String descripcionAct;
    private String logo;

    public Experiencia(String empresa, String puesto, String inicio, String fin, String descripcionAct, String logo) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcionAct = descripcionAct;
        this.logo = logo;
    }

    public Experiencia() {
    }
}
