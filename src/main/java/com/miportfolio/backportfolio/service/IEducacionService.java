/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface IEducacionService {
     public List<Educacion> getEducacion();
    public void saveEducacion(Educacion exp);
    public void deleteEducacion (Long id);
    public Educacion findEducacion (Long id);
}
