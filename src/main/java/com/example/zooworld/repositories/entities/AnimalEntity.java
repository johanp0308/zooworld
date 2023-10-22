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
@Table(name = "animales")
public class AnimalEntity {    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String genero;
    private String origenLugar;
    private String region;

    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date year_Nacimiento;

    @OneToOne()
    @JsonIgnoreProperties("animales")
    private EspecieEntity especie;

    @ManyToOne()
    @JsonIgnoreProperties("animales")
    private ZoologicoEntity zoologico;

}
