package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Skill;
import com.cognizant.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    SkillRepository repository;

    public Skill get(int id) {

        return repository.findById(id).orElse(null);

    }

}