/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.controller;

import com.miportfolio.backportfolio.model.Login;
import com.miportfolio.backportfolio.service.ILoginService;
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
@RequestMapping("/login")
@CrossOrigin(origins = "https://frontnoe-a9212.web.app")
public class ControllerLogin {
 @Autowired 
    private ILoginService interfLogin;
    
    @GetMapping("/mostrar")
    public List<Login>getLogins (){
        return interfLogin.getLogins();
    }
    //interfExp.getExperiencias()
        @PostMapping("/nuevo")
    public Login createEdu (@RequestBody Login login){
       // Experiencia exp= new Experiencia(exp.getEmpresa(), exp.getPuesto(), exp.getInicio(),
         //       exp.getFin(), exp.getLogo(), exp.getDescripcionAct());
         interfLogin.saveLogin(login);
        return login;
    } 
    
    @DeleteMapping("/borrar/{id}")
    public String deleteLogin (@PathVariable Long id){
        interfLogin.deleteLogin(id);
        return "Experiencia eliminada correctamente";
    }
    
    @PutMapping(value ="/editar/{id}")
    public Login editEducacion( @PathVariable("id") Long id, @RequestBody Login login){
        Login login1=interfLogin.findLogin(id);
        interfLogin.saveLogin(login);
        return login1;
}

     @GetMapping("/traer/{id}")
    public Login findedu(@PathVariable Long id){
        return interfLogin.findLogin(id);
                }

    
}
