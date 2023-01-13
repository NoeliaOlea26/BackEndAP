/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Educacion;
import com.miportfolio.backportfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noelia Olea
 */
@Service
public class EducacionService implements IEducacionService{
     @Autowired
     public EducacionRepository eduRepo;
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEduc = eduRepo.findAll();
        return listaEduc;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id); 
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu; 
    }
    
}
