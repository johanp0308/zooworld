package com.example.zooworld.repositories.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="zoologicos")
public class ZoologicoEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private String pais;
    private String ubicacion;
    private float area;
    private float presupuesto_anual;
    
    @OneToMany(mappedBy = "zoologicos", cascade = CascadeType.ALL)
    private List<AnimalEntity> animales;
    // @OneToMany(mappedBy = "zoologicos",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    // @JsonIgnoreProperties("zoologico")
    // private List<AnimalZooligicoEntity> animal_zoologico;
}