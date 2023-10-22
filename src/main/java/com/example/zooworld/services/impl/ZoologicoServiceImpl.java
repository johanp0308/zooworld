package com.example.zooworld.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zooworld.repositories.ZoologicoRepository;
import com.example.zooworld.repositories.entities.ZoologicoEntity;
import com.example.zooworld.services.ZoologicoService;

@Service
public class ZoologicoServiceImpl implements ZoologicoService{

    @Autowired
    private ZoologicoRepository zoologicoRepository; 

    @Override
    public ZoologicoEntity findById(Long id) {
        return zoologicoRepository.findById(id).orElse(null);
    }

    @Override
    public List<ZoologicoEntity> findAll() {
        return (List<ZoologicoEntity>)zoologicoRepository.findAll();
    }
    
}
