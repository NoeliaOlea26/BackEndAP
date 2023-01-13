/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Proyecto;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface IProyecService {
    public List<Proyecto> getProyectos();
    public void saveProyecto(Proyecto exp);
    public void deleteProyecto (Long id);
    public Proyecto findProyecto (Long id);
}
