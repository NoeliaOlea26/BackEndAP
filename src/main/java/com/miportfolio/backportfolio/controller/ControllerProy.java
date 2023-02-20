/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.controller;


import com.miportfolio.backportfolio.model.Proyecto;

import com.miportfolio.backportfolio.service.IProyecService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Noelia Olea
 */
@RestController
@RequestMapping("/proyecto")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://frontnoe-a9212.web.app")
public class ControllerProy {
    @Autowired 
    private IProyecService interfProy;
    
    @GetMapping("/mostrar")
    public List<Proyecto>getProyectos (){
        return interfProy.getProyectos();
    }
    //interfExp.getExperiencias()
        @PostMapping("/nuevo")
    public Proyecto createProyecto (@RequestBody Proyecto proy){
        interfProy.saveProyecto(proy);
        return proy;
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String deleteProyecto (@PathVariable Long id){
        interfProy.deleteProyecto(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping(value ="/editar/{id}")
    public Proyecto editProyecto( @PathVariable("id") Long id, @RequestBody Proyecto proy){
        Proyecto proy1=interfProy.findProyecto(id);
        interfProy.saveProyecto(proy);
        return proy1;
}

   
     @GetMapping("/traer/{id}")
    public Proyecto findProyecto(@PathVariable Long id){
        return interfProy.findProyecto(id);
                }

    
}