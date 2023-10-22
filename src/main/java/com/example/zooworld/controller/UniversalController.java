package com.example.zooworld.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zooworld.repositories.entities.ZoologicoEntity;
import com.example.zooworld.services.ZoologicoService;

@RestController
@RequestMapping("/app")
public class UniversalController {
    
    @Autowired
    private ZoologicoService zoologicoService;
    
    @GetMapping("/zoo/{id}")
    public ZoologicoEntity findById(@PathVariable Long id){
        return zoologicoService.findById(id);
    }

    @GetMapping("/zoo/")
    public List<ZoologicoEntity> findAll(){
        return zoologicoService.findAll();
    }
}
