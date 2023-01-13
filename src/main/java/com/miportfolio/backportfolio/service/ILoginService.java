/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Login;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface ILoginService {
    public List<Login> getLogins();
    public void saveLogin(Login login);
    public void deleteLogin (Long id);
    public Login findLogin (Long id);
}
