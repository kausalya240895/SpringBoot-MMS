package com.Spring_MarineManagementSystem.service;

import com.Spring_MarineManagementSystem.Repository.MarineLifeRepository;
import com.Spring_MarineManagementSystem.entity.MarineLife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarineLifeService {

        @Autowired
        private MarineLifeRepository marineLifeRepository;

        public List<MarineLife> getAllMarineLife() {
            return marineLifeRepository.findAll();
        }

        public MarineLife getMarineLifeById(Long id) {
            return marineLifeRepository.findById(id).orElse(null);
        }

        public MarineLife createMarineLife(MarineLife marineLife) {
            return marineLifeRepository.save(marineLife);
        }

//        public MarineLife updateMarineLife(MarineLife marineLife) {
//            return marineLifeRepository.save(marineLife);
//        }

    public MarineLife updateMarineLife(Long id, MarineLife marineLife) {
        MarineLife existingMarineLife = marineLifeRepository.findById(id).orElse(null);
        if (existingMarineLife != null) {
            existingMarineLife.setSpecies(marineLife.getSpecies());
            existingMarineLife.setHabitats(marineLife.getHabitats());
            existingMarineLife.setPopulation(marineLife.getPopulation());
            return marineLifeRepository.save(existingMarineLife);
        } else {
            return null;
        }
    }
        public void deleteMarineLife(Long id) {
            marineLifeRepository.deleteById(id);
        }
    }

