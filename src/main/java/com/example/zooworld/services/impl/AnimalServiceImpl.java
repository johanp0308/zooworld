package com.example.zooworld.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zooworld.repositories.AnimalRepository;
import com.example.zooworld.repositories.entities.AnimalEntity;
import com.example.zooworld.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService{

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<AnimalEntity> findAll() {
        return (List<AnimalEntity>) animalRepository.findAll();
    }

    @Override
    public AnimalEntity save(AnimalEntity animal) {
        return animalRepository.save(animal);
    }
    
}
