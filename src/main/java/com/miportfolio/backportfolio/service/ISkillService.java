/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Skill;
import java.util.List;

/**
 *
 * @author Noelia Olea
 */
public interface ISkillService {
     public List<Skill> getSkills();
    public void saveSkill(Skill skill);
    public void deleteSkill (Long id);
    public Skill findSkill (Long id);
}
