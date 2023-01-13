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

@Getter @Setter
@Entity
public class Persona{
    
    @Id
    @GeneratedValue
    (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String cargo;
    private String descrip;
    private String foto;

    public Persona(Long id, String nombre, String apellido, String cargo, String descrip, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.descrip = descrip;
        this.foto = foto;
    }

    public Persona() {
    }
    
}
