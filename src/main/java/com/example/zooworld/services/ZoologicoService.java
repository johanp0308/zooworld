package com.example.zooworld.services;


import java.util.List;

import com.example.zooworld.repositories.entities.ZoologicoEntity;

public interface ZoologicoService {
    
    ZoologicoEntity findById(Long id);

    List<ZoologicoEntity> findAll();
}
