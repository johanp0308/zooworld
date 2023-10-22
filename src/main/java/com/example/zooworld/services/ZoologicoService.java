package com.example.zooworld.services;

import com.example.zooworld.repositories.entities.ZoologicoEntity;

public interface ZoologicoService {
    
    ZoologicoEntity findById(Long id);

}
