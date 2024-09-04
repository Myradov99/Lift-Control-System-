package com.lift_control.liftcontrol.dto;

public class RequestDto {
    private boolean reqUp;
    private boolean reqDown;
    private Long id;
    private Long liftId;
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