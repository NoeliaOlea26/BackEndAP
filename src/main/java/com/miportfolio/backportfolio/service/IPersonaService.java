/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Persona;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface IPersonaService {
    public List<Persona> getPersonas();
    public void savePersona (Persona pers);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
}
