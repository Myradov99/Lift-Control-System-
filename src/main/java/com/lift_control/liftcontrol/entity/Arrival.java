package com.lift_control.liftcontrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arrival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long liftId;
    private boolean arUp;
    private boolean arDown;
    private String arrived;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLiftId() {
        return liftId;
    }

    public void setLiftId(Long liftId) {
        this.liftId = liftId;
    }

    public boolean isArUp() {
        return arUp;
    }

    public void setArUp(boolean arUp) {
        this.arUp = arUp;
    }

    public boolean isArDown() {
        return arDown;
    }

    public void setArDown(boolean arDown) {
        this.arDown = arDown;
    }

    public String getArrived() {
        return arrived;
    }

    public void setArrived(String arrived) {
        this.arrived = arrived;
    }
}