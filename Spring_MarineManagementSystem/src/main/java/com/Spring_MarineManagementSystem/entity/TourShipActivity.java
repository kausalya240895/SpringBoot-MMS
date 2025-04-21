package com.Spring_MarineManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tour_ship_activity")
public class TourShipActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="location")
    private String location;

    @Column(name = "permit")
    private String permit;

    @Column(name="schedule")
    private String schedule;

    public TourShipActivity(Long id,String location,String permit,String schedule){
        super();
        this.location=location;
        this.permit=permit;
        this.schedule=schedule;
    }
public TourShipActivity(){}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
