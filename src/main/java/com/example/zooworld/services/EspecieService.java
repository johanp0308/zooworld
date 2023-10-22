package com.example.zooworld.services;

import java.util.List;

import com.example.zooworld.repositories.entities.EspecieEntity;

public interface EspecieService {
    
    List<EspecieEntity> findAll();

    EspecieEntity findById();
}
