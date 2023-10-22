package com.example.zooworld.services;

import java.util.List;

import com.example.zooworld.repositories.entities.AnimalEntity;

public interface AnimalService {
    
    List<AnimalEntity> findAll();

    AnimalEntity save(AnimalEntity animal);

}
