package com.Spring_MarineManagementSystem.service;

import com.Spring_MarineManagementSystem.Repository.FishingRegulationRepository;
import com.Spring_MarineManagementSystem.entity.FishingRegulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishingRegulationService {

    @Autowired
    private FishingRegulationRepository fishingRegulationRepository;

    public List<FishingRegulation> getAllFishingRegulations() {
        return fishingRegulationRepository.findAll();
    }

    public FishingRegulation getFishingRegulationById(Long id) {
        return fishingRegulationRepository.findById(id).orElse(null);
    }

    public FishingRegulation createFishingRegulation(FishingRegulation fishingRegulation) {
        return fishingRegulationRepository.save(fishingRegulation);
    }

//    public FishingRegulation updateFishingRegulation(FishingRegulation fishingRegulation) {
//        return fishingRegulationRepository.save(fishingRegulation);
//    }
public FishingRegulation updateFishingRegulation(Long id, FishingRegulation fishingRegulation) {
    FishingRegulation existingFishingRegulation = fishingRegulationRepository.findById(id).orElse(null);
    if (existingFishingRegulation != null) {
        return fishingRegulationRepository.save(existingFishingRegulation);
    } else {
        return null;
    }
}
    public void deleteFishingRegulation(Long id) {
        fishingRegulationRepository.deleteById(id);
    }
}