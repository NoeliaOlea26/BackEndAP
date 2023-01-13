/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Login;
import com.miportfolio.backportfolio.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noelia Olea
 */
@Service

public class LoginService implements ILoginService{

    @Autowired
    public LoginRepository loginRepo; 
    
    @Override
    public List<Login> getLogins() {
        List<Login> listaLogins = loginRepo.findAll();
        return listaLogins;
    }

    @Override
    public void saveLogin(Login login) {
            loginRepo.save(login);
    }

    @Override
    public void deleteLogin(Long id) {
            loginRepo.deleteById(id);  
    }

    @Override
    public Login findLogin(Long id) {
                Login login = loginRepo.findById(id).orElse(null);
    return login; 
    }
    
}
