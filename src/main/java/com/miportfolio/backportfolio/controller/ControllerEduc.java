/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.controller;


import com.miportfolio.backportfolio.model.Educacion;
import com.miportfolio.backportfolio.service.IEducacionService;

import com.miportfolio.backportfolio.service.IExperienciaService;

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
@RequestMapping("/educacion")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://frontnoe-a9212.web.app")
public class ControllerEduc {
    @Autowired 
    private IEducacionService interfEdu;
    
    @GetMapping("/mostrar")
    public List<Educacion>getEducaciones (){
        return interfEdu.getEducacion();
    }
    //interfExp.getExperiencias()
        @PostMapping("/nuevo")
    public Educacion createEdu (@RequestBody Educacion edu){
       // Experiencia exp= new Experiencia(exp.getEmpresa(), exp.getPuesto(), exp.getInicio(),
         //       exp.getFin(), exp.getLogo(), exp.getDescripcionAct());
         interfEdu.saveEducacion(edu);
        return edu;
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id){
        interfEdu.deleteEducacion(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping(value ="/editar/{id}")
    public Educacion editEducacion( @PathVariable("id") Long id, @RequestBody Educacion edu){
        Educacion edu1=interfEdu.findEducacion(id);
        interfEdu.saveEducacion(edu);
        return edu1;
}

    
     @GetMapping("/traer/{id}")
    public Educacion findedu(@PathVariable Long id){
        return interfEdu.findEducacion(id);
                }

    
}
