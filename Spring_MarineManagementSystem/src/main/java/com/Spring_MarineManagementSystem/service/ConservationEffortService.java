package com.Spring_MarineManagementSystem.service;

import com.Spring_MarineManagementSystem.Repository.ConservationEffortRepository;
import com.Spring_MarineManagementSystem.entity.ConservationEffort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConservationEffortService {

        @Autowired
        private ConservationEffortRepository conservationEffortRepository;

        public List<ConservationEffort> getAllConservationEfforts() {
            return conservationEffortRepository.findAll();
        }

        public ConservationEffort getConservationEffortById(Long id) {
            return conservationEffortRepository.findById(id).orElse(null);
        }

        public ConservationEffort createConservationEffort(ConservationEffort conservationEffort) {
            return conservationEffortRepository.save(conservationEffort);
        }

//        public ConservationEffort updateConservationEffort(ConservationEffort conservationEffort) {
//            return conservationEffortRepository.save(conservationEffort);
//        }


    public ConservationEffort updateConservationEffort(Long id, ConservationEffort conservationEffort) {
        ConservationEffort existingConservationEffort = conservationEffortRepository.findById(id).orElse(null);
        if (existingConservationEffort != null) {
            return conservationEffortRepository.save(existingConservationEffort);
        } else {
            return null;
        }
    }
    public void deleteConservationEffort(Long id) {
            conservationEffortRepository.deleteById(id);
        }
    }


