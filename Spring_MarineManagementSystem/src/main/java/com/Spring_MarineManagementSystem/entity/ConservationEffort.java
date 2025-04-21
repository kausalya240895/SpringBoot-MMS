package com.Spring_MarineManagementSystem.entity;

import jakarta.persistence.*;


@Entity
@Table(name="conservation_effort")
public class ConservationEffort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="project_name")
    private String project_name;

    @Column(name="location")
    private String location;

    @Column(name="goal")
    private String goal;

    public Long getId() {
        return id;
    }
    public  ConservationEffort(Long id,String project_name,String location,String goal){
        super();
        this.project_name=project_name;
        this.location=location;
        this.goal=goal;
    }
    public ConservationEffort(){}

    public void setId(Long id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

}
