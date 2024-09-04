package com.lift_control.liftcontrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StartMoving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean st_up;
    private boolean st_down;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStUp() {
        return st_up;
    }

    public void setStUp(boolean st_up) {
        this.st_up = st_up;
    }

    public boolean isStDown() {
        return st_down;
    }

    public void setStDown(boolean st_down) {
        this.st_down = st_down;
    }
}
