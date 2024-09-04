package com.lift_control.liftcontrol.dto;

public class StartMovingDto {
    private Long id;
    private boolean stUp;
    private boolean stDown;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStUp() {
        return stUp;
    }

    public void setStUp(boolean stUp) {
        this.stUp = stUp;
    }

    public boolean isStDown() {
        return stDown;
    }

    public void setStDown(boolean stDown) {
        this.stDown = stDown;
    }
}
