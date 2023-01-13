/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Experiencia;
import com.miportfolio.backportfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noelia Olea
 */
@Service
public class ExperienciaService implements IExperienciaService{
     @Autowired
     public ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> getExperiencias() {
        List<Experiencia> listaExperiencias = expRepo.findAll();
        return listaExperiencias;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepo.deleteById(id); 
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp; 
    }
    
}
