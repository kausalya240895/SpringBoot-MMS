package com.Spring_MarineManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="fishing_regulation")
public class FishingRegulation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "zone")
        private String zone;

        @Column(name = "quota")
        private Integer quota;

        @Column(name = "restriction")
        private String restriction;

        public FishingRegulation(Long id,String zone,Integer quota, String restriction){
            super();
            this.zone=zone;
            this.quota=quota;
            this.restriction=restriction;
        }
    public FishingRegulation(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }
}

