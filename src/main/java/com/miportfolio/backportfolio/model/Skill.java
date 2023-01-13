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
public class Skill {
        @Id
    @GeneratedValue
    (strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private int porcentaje;
    private String color;
    private String fontsize;
    private String outSC;
    private String innSC;

    public Skill(String titulo, int porcentaje, String color, String fontsize, String outSC, String innSC) {
        this.titulo = titulo;
        this.porcentaje = porcentaje;
        this.color = color;
        this.fontsize = fontsize;
        this.outSC = outSC;
        this.innSC = innSC;
    }

    public Skill() {
    }
    
}
