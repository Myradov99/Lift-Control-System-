package com.lift_control.liftcontrol.dto;

public class LiftDto {
    private Long id;
    private boolean isClosed;
    private boolean isOpening;
    private int currentFloor;
    private boolean isMovingUp;

    // Constructori
    public LiftDto() {}

    public LiftDto(Long id, boolean isClosed, boolean isOpening, int currentFloor, boolean isMovingUp) {
        this.id = id;
        this.isClosed = isClosed;
        this.isOpening = isOpening;
        this.currentFloor = currentFloor;
        this.isMovingUp = isMovingUp;
    }

    // Getters și Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isOpening() {
        return isOpening;
    }

    public void setOpening(boolean opening) {
        isOpening = opening;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isMovingUp() {
        return isMovingUp;
    }

    public void setMovingUp(boolean movingUp) {
        isMovingUp = movingUp;
    }

    // toString method pentru debugging și logare
    @Override
    public String toString() {
        return "LiftDto{" +
                "id=" + id +
                ", isClosed=" + isClosed +
                ", isOpening=" + isOpening +
                ", currentFloor=" + currentFloor +
                ", isMovingUp=" + isMovingUp +
                '}';
    }
}