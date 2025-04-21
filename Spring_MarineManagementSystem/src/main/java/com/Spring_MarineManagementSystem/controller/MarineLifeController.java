package com.Spring_MarineManagementSystem.controller;

import com.Spring_MarineManagementSystem.entity.MarineLife;
import com.Spring_MarineManagementSystem.service.MarineLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marine-life")
public class MarineLifeController {

        @Autowired
        private MarineLifeService marineLifeService;

        @GetMapping
        public List<MarineLife> getAllMarineLife() {
            return marineLifeService.getAllMarineLife();
        }

        @GetMapping("/{id}")
        public MarineLife getMarineLifeById(@PathVariable Long id) {
            return marineLifeService.getMarineLifeById(id);
        }

        @PostMapping
        public MarineLife createMarineLife(@RequestBody MarineLife marineLife) {
            return marineLifeService.createMarineLife(marineLife);
        }

        @PutMapping("/{id}")
        public MarineLife updateMarineLife(@PathVariable Long id, @RequestBody MarineLife marineLife) {
            return marineLifeService.updateMarineLife(id,marineLife);
        }

        @DeleteMapping("/{id}")
        public void deleteMarineLife(@PathVariable Long id) {
            marineLifeService.deleteMarineLife(id);
        }
    }


