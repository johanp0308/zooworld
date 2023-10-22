package com.example.zooworld.repositories.entities;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="especie")
public class EspecieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_cientifico;
    private String nombre_comun;
    private String familia;
    private String situacion;
    
    @OneToOne(mappedBy = "especie",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("animales")
    private List<AnimalEntity> animales;

    // @OneToMany(mappedBy = "animales",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    // @JsonIgnoreProperties("animal")
    // private List<AnimalZooligicoEntity> animal_zooligico;
}
