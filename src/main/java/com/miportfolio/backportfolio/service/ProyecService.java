/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Proyecto;
import com.miportfolio.backportfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noelia Olea
 */
@Service
public class ProyecService implements IProyecService{
     @Autowired
     public ProyectoRepository proyRepo;
    
    
    @Override
    public List<Proyecto> getProyectos() {
        List<Proyecto> listaProyectos = proyRepo.findAll();
        return listaProyectos;    }

    @Override
    public void saveProyecto(Proyecto proy) {
        proyRepo.save(proy);    }

    @Override
    public void deleteProyecto(Long id) {
        proyRepo.deleteById(id);    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proy = proyRepo.findById(id).orElse(null);
        return proy;     }
    
}
