/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.controller;

import com.miportfolio.backportfolio.model.Persona;
import com.miportfolio.backportfolio.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
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
@RequestMapping("/personas")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerPer {
    
    //List<Persona> listaPersonas = new ArrayList();
    @Autowired 
    private IPersonaService interfPers;
    
    @GetMapping("/mostrar")
    public List<Persona>getPersonas (){
        return interfPers.getPersonas();
    }

            @PostMapping("/nuevo")
    public Persona createPer (@RequestBody Persona pers){
       // Experiencia exp= new Experiencia(exp.getEmpresa(), exp.getPuesto(), exp.getInicio(),
         //       exp.getFin(), exp.getLogo(), exp.getDescripcionAct());
        interfPers.savePersona(pers);
        return pers;
    } 
    
            @PutMapping(value ="/editar/{id}")
    public Persona editPers( @PathVariable("id") Long id, @RequestBody Persona pers){
        Persona pers1 = interfPers.findPersona(id);
        interfPers.savePersona(pers);
        return pers1;
}
    
    @DeleteMapping("/borrar/{id}")
    public String deletePers (@PathVariable Long id){
        interfPers.deletePersona(id);
        return "Persona eliminada correctamente";
    }
    
        @GetMapping("/traer/miperfil")
    public Persona findme(){
        return interfPers.findPersona((long)1);
                }
     @GetMapping("/traer/{id}")
    public Persona findper(@PathVariable Long id){
        return interfPers.findPersona(id);
                }
    
    
    
    
    @PutMapping("/editar0/{id}")
    public Persona editPers0 (@PathVariable Long id,
                             @RequestParam  ("nombre")String nvoNombre,
                             @RequestParam  ("apellido")String nvoApellido,
                             @RequestParam  ("cargo")String nvoCargo,
                             @RequestParam  ("descrip")String nvoDescrip,
                             @RequestParam  ("foto")String nvoFoto){
        Persona pers =interfPers.findPersona(id);
        pers.setNombre(nvoNombre);
        pers.setApellido(nvoApellido);
        pers.setCargo(nvoCargo);
        pers.setDescrip(nvoDescrip);
        pers.setFoto(nvoFoto);
        
        interfPers.savePersona(pers);
        return pers;
                                    }
    
    @PostMapping("/nuevo0")
    public String createPer0 (@RequestBody Persona pers){
        interfPers.savePersona(pers);
        return "Personas creada correctamente";
    } 
    
    
    

}
