package com.Spring_MarineManagementSystem.service;

import com.Spring_MarineManagementSystem.Repository.TourShipActivityRepository;
import com.Spring_MarineManagementSystem.entity.TourShipActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourShipActivityService {
        @Autowired
        private TourShipActivityRepository tourShipActivityRepository;

        public List<TourShipActivity> getAllTourShipActivity() {
            return tourShipActivityRepository.findAll();
        }

        public TourShipActivity getTourShipActivityById(Long id) {
            return tourShipActivityRepository.findById(id).orElse(null);
        }

        public TourShipActivity createTourShipActivity(TourShipActivity tourShipActivity) {
            return tourShipActivityRepository.save(tourShipActivity);
        }

//        public TourShipActivity updateTourShipActivity(TourShipActivity tourShipActivity) {
//            return tourShipActivityRepository.save(tourShipActivity);
//        }
    public TourShipActivity updateTourShipActivity(Long id, TourShipActivity tourShipActivity) {
        TourShipActivity existingActivity = tourShipActivityRepository.findById(id).orElse(null);
        if (existingActivity != null) {
            existingActivity.setLocation(tourShipActivity.getLocation());
            existingActivity.setPermit(tourShipActivity.getPermit());
            existingActivity.setSchedule(tourShipActivity.getSchedule());
            return tourShipActivityRepository.save(existingActivity);
        } else {
            return null;
        }
    }
        public void deleteTourShipActivity(Long id) {
            tourShipActivityRepository.deleteById(id);
        }
    }

