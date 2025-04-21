package com.Spring_MarineManagementSystem.controller;

import com.Spring_MarineManagementSystem.entity.FishingRegulation;
import com.Spring_MarineManagementSystem.service.FishingRegulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fishing-regulations")
public class FishingRegulationController{

        @Autowired
        private FishingRegulationService fishingRegulationService;

        @GetMapping
        public List<FishingRegulation> getAllFishingRegulations() {
            return fishingRegulationService.getAllFishingRegulations();
        }

        @GetMapping("/{id}")
        public FishingRegulation getFishingRegulationById(@PathVariable Long id) {
            return fishingRegulationService.getFishingRegulationById(id);
        }

        @PostMapping
        public FishingRegulation createFishingRegulation(@RequestBody FishingRegulation fishingRegulation) {
            return fishingRegulationService.createFishingRegulation(fishingRegulation);
        }

        @PutMapping("/{id}")
        public FishingRegulation updateFishingRegulation(@PathVariable Long id, @RequestBody FishingRegulation fishingRegulation) {
            return fishingRegulationService.updateFishingRegulation(id,fishingRegulation);
        }

        @DeleteMapping("/{id}")
        public void deleteFishingRegulation(@PathVariable Long id) {
            fishingRegulationService.deleteFishingRegulation(id);
        }
    }

