/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Persona;
import com.miportfolio.backportfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);    
    }

    @Override
    public Persona findPersona(Long id) {
        Persona pers = persoRepo.findById(id).orElse(null);
    return pers; 
    }
    
}
