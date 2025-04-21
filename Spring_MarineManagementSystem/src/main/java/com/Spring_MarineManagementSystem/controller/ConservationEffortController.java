package com.Spring_MarineManagementSystem.controller;

import com.Spring_MarineManagementSystem.entity.ConservationEffort;
import com.Spring_MarineManagementSystem.service.ConservationEffortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conservation-efforts")
public class ConservationEffortController {

        @Autowired
        private ConservationEffortService conservationEffortService;

        @GetMapping
        public List<ConservationEffort> getAllConservationEfforts() {
            return conservationEffortService.getAllConservationEfforts();
        }

        @GetMapping("/{id}")
        public ConservationEffort getConservationEffortById(@PathVariable Long id) {
            return conservationEffortService.getConservationEffortById(id);
        }

        @PostMapping
        public ConservationEffort createConservationEffort(@RequestBody ConservationEffort conservationEffort) {
            return conservationEffortService.createConservationEffort(conservationEffort);
        }

        @PutMapping("/{id}")
        public ConservationEffort updateConservationEffort(@PathVariable Long id, @RequestBody ConservationEffort conservationEffort) {
            return conservationEffortService.updateConservationEffort(id,conservationEffort);
        }

        @DeleteMapping("/{id}")
        public void deleteConservationEffort(@PathVariable Long id) {
            conservationEffortService.deleteConservationEffort(id);
        }
    }

