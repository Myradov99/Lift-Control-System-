package com.lift_control.liftcontrol.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long liftId;
    private boolean reqUp;
    private boolean reqDown;

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

    public boolean isReqUp() {
        return reqUp;
    }

    public void setReqUp(boolean reqUp) {
        this.reqUp = reqUp;
    }

    public boolean isReqDown() {
        return reqDown;
    }

    public void setReqDown(boolean reqDown) {
        this.reqDown = reqDown;
    }
}