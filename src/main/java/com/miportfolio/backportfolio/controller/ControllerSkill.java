/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.controller;

import com.miportfolio.backportfolio.model.Skill;
import com.miportfolio.backportfolio.service.ISkillService;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Noelia Olea
 */
@RestController
@RequestMapping("/skill")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://frontnoe-a9212.web.app")
public class ControllerSkill {
     @Autowired 
     private ISkillService interfSkill;
 @GetMapping("/mostrar")
    public List<Skill>getSkills (){
        return interfSkill.getSkills();
    }
    //interfExp.getExperiencias()
        @PostMapping("/nuevo")
    public Skill createSkill (@RequestBody Skill skill){
        interfSkill.saveSkill(skill);
        return skill;
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String deleteSkill (@PathVariable Long id){
        interfSkill.deleteSkill(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping(value ="/editar/{id}")
    public Skill editSkill( @PathVariable("id") Long id, @RequestBody Skill skill){
        Skill skill1=interfSkill.findSkill(id);
        interfSkill.saveSkill(skill);
        return skill1;
}

   
     @GetMapping("/traer/{id}")
    public Skill findSkill(@PathVariable Long id){
        return interfSkill.findSkill(id);
                }

    
}
