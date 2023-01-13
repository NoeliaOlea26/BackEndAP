/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.repository;

import com.miportfolio.backportfolio.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Noelia Olea
 */
public interface LoginRepository extends JpaRepository<Login, Long>{
    
}
