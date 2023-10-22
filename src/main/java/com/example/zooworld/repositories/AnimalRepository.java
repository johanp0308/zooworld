package com.example.zooworld.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.zooworld.repositories.entities.AnimalEntity;

public interface AnimalRepository extends CrudRepository<AnimalEntity,Long> {
    
}
