package com.Spring_MarineManagementSystem.entity;

import jakarta.persistence.*;
import org.springframework.expression.spel.ast.QualifiedIdentifier;

@Entity
@Table(name="marine_life")
public class MarineLife {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "species")
    private String species;

    @Column(name = "habitats")
    private String habitats;

    @Column(name = "population")
    private Integer population;

    public MarineLife(Long id,String species,String habitats,Integer population){
        super();
        this.species=species;
        this.habitats=habitats;
        this.population=population;
    }

    public MarineLife(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) { this.species = species; }

    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
