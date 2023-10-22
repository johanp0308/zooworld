package com.example.zooworld.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.zooworld.repositories.entities.EspecieEntity;

public interface EspecieRepository extends CrudRepository<EspecieEntity,Long> {
    
}
