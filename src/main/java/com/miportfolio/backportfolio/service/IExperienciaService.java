/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface IExperienciaService {
    public List<Experiencia> getExperiencias();
    public void saveExperiencia(Experiencia exp);
    public void deleteExperiencia (Long id);
    public Experiencia findExperiencia (Long id);
}
