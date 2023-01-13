/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfolio.backportfolio.service;

import com.miportfolio.backportfolio.model.Skill;
import com.miportfolio.backportfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noelia Olea
 */
@Service
public class SkillService implements ISkillService{
@Autowired
public SkillRepository skillRepo;
    @Override
    public List<Skill> getSkills() {
        List<Skill> listaSkills = skillRepo.findAll();
        return listaSkills;    }

    @Override
    public void saveSkill(Skill skill) {
skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
skillRepo.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = skillRepo.findById(id).orElse(null);
        return skill;     }
    
}
