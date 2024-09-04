package com.lift_control.liftcontrol.dto;

public class ArrivalDto {
    private Long id;
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
    }public String getarrived() {
        return arrived;
    }

    public void setarrived(String arrived) {
        this.arrived = arrived;
    }
}
