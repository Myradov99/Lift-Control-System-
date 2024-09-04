package com.lift_control.liftcontrol.service;

import com.lift_control.liftcontrol.dto.LiftDto;
import com.lift_control.liftcontrol.dto.RequestDto;
import com.lift_control.liftcontrol.dto.ArrivalDto;

import java.util.List;

public interface LiftServiceInterface {
    List<LiftDto> getAllLifts();
    LiftDto getLiftById(Long id);
    LiftDto saveLift(LiftDto liftDto);
    void deleteLift(Long id);
    LiftDto moveLiftUp(Long liftId);
    LiftDto openLift(Long liftId);
    LiftDto closeLift(Long liftId);
    LiftDto updateLift(Long id, LiftDto liftDto);
    void sendLiftRequest(Long liftId, RequestDto requestDto);
    void updateArrivalStatus(Long liftId, ArrivalDto arrivalDto);
}