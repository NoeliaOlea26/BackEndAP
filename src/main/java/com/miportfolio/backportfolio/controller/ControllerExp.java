/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.controller;

import com.miportfolio.backportfolio.model.Experiencia;
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
@RequestMapping("/experiencia")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://frontnoe-a9212.web.app")
public class ControllerExp {
    @Autowired 
    private IExperienciaService interfExp;
    
    @GetMapping("/mostrar")
    public List<Experiencia>getExperiencias (){
        return interfExp.getExperiencias();
    }
    @PostMapping("/nuevo0")
    public String createExp0 (@RequestBody Experiencia exp){
        interfExp.saveExperiencia(exp);
        return "experiencia creada correctamente";
    } 
    
        @PostMapping("/nuevo")
    public Experiencia createExp (@RequestBody Experiencia exp){
       // Experiencia exp= new Experiencia(exp.getEmpresa(), exp.getPuesto(), exp.getInicio(),
         //       exp.getFin(), exp.getLogo(), exp.getDescripcionAct());
        interfExp.saveExperiencia(exp);
        return exp;
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        interfExp.deleteExperiencia(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping(value ="/editar/{id}")
    public Experiencia editExperiencia( @PathVariable("id") Long id, @RequestBody Experiencia exp){
        Experiencia exp1= interfExp.findExperiencia(id);
        interfExp.saveExperiencia(exp);
        return exp1;
}

    @PutMapping("/editar1/{id}")
    public Experiencia editExperiencia0 (@PathVariable Long id,
                             @RequestParam  ("empresa")String nvoEmpresa,
                             @RequestParam  ("puesto")String nvoPuesto,
                             @RequestParam  ("inicio")String nvoInicio,
                             @RequestParam  ("fin")String nvoFin,
                             @RequestParam  ("descripcionAct")String nvoDescripcionAct,
                             @RequestParam ("logo")String nvoLogo){
        Experiencia exp =interfExp.findExperiencia(id);
        exp.setEmpresa(nvoEmpresa);
        exp.setPuesto(nvoPuesto);
        exp.setInicio(nvoInicio);
        exp.setFin(nvoFin);
        exp.setDescripcionAct(nvoDescripcionAct);
        exp.setLogo(nvoLogo);

        
        interfExp.saveExperiencia(exp);
        return exp;
                                    }
    
     @GetMapping("/traer/{id}")
    public Experiencia findexp(@PathVariable Long id){
        return interfExp.findExperiencia(id);
                }

    
}
