/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.repository;

import com.miportfolio.backportfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Noelia Olea
 */

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
