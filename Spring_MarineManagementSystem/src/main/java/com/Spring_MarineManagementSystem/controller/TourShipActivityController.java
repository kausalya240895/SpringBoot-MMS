package com.Spring_MarineManagementSystem.controller;

import com.Spring_MarineManagementSystem.entity.TourShipActivity;
import com.Spring_MarineManagementSystem.service.TourShipActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tour-ship-activities")
public class TourShipActivityController {

        @Autowired
        private TourShipActivityService tourShipActivityService;

        @GetMapping
        public List<TourShipActivity> getAllTourShipActivity() {
            return tourShipActivityService.getAllTourShipActivity();
        }

        @GetMapping("/{id}")
        public TourShipActivity getTourShipActivityById(@PathVariable Long id) {
            return tourShipActivityService.getTourShipActivityById(id);
        }

        @PostMapping
        public TourShipActivity createTourShipActivity(@RequestBody TourShipActivity tourShipActivity) {
            return tourShipActivityService.createTourShipActivity(tourShipActivity);
        }

        @PutMapping("/{id}")
        public TourShipActivity updateTourShipActivity(@PathVariable Long id, @RequestBody TourShipActivity tourShipActivity) {
            return tourShipActivityService.updateTourShipActivity(id,tourShipActivity);
        }

        @DeleteMapping("/{id}")
        public void deleteTourShipActivity(@PathVariable Long id) {
            tourShipActivityService.deleteTourShipActivity(id);
        }
    }

