package com.lift_control.liftcontrol.service;

import com.lift_control.liftcontrol.dto.LiftDto;
import com.lift_control.liftcontrol.dto.RequestDto;
import com.lift_control.liftcontrol.dto.ArrivalDto;
import com.lift_control.liftcontrol.entity.Lift;
import com.lift_control.liftcontrol.entity.Request;
import com.lift_control.liftcontrol.entity.Arrival;
import com.lift_control.liftcontrol.repository.LiftRepository;
import com.lift_control.liftcontrol.repository.RequestRepository;
import com.lift_control.liftcontrol.repository.ArrivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LiftService implements LiftServiceInterface {
    @Autowired
    private LiftRepository liftRepository;
    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private ArrivalRepository arrivalRepository;

    private LiftDto convertToDto(Lift lift) {
        return new LiftDto(
            lift.getId(),
            lift.isClosed(),
            lift.isOpening(),
            lift.getCurrentFloor(),
            lift.isMovingUp()
        );
    }

    private Lift convertToEntity(LiftDto liftDto) {
        Lift lift = new Lift();
        lift.setId(liftDto.getId());
        lift.setClosed(liftDto.isClosed());
        lift.setOpening(liftDto.isOpening());
        lift.setCurrentFloor(liftDto.getCurrentFloor());
        lift.setMovingUp(liftDto.isMovingUp());
        return lift;
    }

    @Override
    public List<LiftDto> getAllLifts() {
        return liftRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public LiftDto getLiftById(Long id) {
        return liftRepository.findById(id)
                .map(this::convertToDto)
                .orElse(null);
    }

    @Override
    public LiftDto saveLift(LiftDto liftDto) {
        Lift lift = convertToEntity(liftDto);
        return convertToDto(liftRepository.save(lift));
    }

    @Override
    public void deleteLift(Long id) {
        liftRepository.deleteById(id);
    }

    @Override
    public LiftDto moveLiftUp(Long liftId) {
        Lift lift = liftRepository.findById(liftId).orElseThrow(() -> new RuntimeException("Lift not found"));
        lift.setClosed(true);
        lift.setOpening(false);
        lift.setMovingUp(true);
        lift.setCurrentFloor(lift.getCurrentFloor() + 1);
        return convertToDto(liftRepository.save(lift));
    }

    @Override
    public LiftDto openLift(Long liftId) {
        Lift lift = liftRepository.findById(liftId).orElseThrow(() -> new RuntimeException("Lift not found"));
        lift.setClosed(false);
        lift.setOpening(true);
        lift.setMovingUp(false);
        return convertToDto(liftRepository.save(lift));
    }

    @Override
    public LiftDto closeLift(Long liftId) {
        Lift lift = liftRepository.findById(liftId).orElseThrow(() -> new RuntimeException("Lift not found"));
        lift.setClosed(true);
        lift.setOpening(false);
        return convertToDto(liftRepository.save(lift));
    }

    @Override
    public LiftDto updateLift(Long id, LiftDto liftDto) {
        return liftRepository.findById(id)
                .map(existingLift -> {
                    existingLift.setClosed(liftDto.isClosed());
                    existingLift.setOpening(liftDto.isOpening());
                    existingLift.setCurrentFloor(liftDto.getCurrentFloor());
                    existingLift.setMovingUp(liftDto.isMovingUp());
                    return convertToDto(liftRepository.save(existingLift));
                })
                .orElseThrow(() -> new RuntimeException("Lift not found"));
    }

    @Override
    public void sendLiftRequest(Long liftId, RequestDto requestDto) {
        Lift lift = liftRepository.findById(liftId).orElseThrow(() -> new RuntimeException("Lift not found"));
        Request request = new Request();
        request.setLiftId(lift.getId());
        request.setReqUp(requestDto.isReqUp());
        request.setReqDown(requestDto.isReqDown());
        requestRepository.save(request);
    }

    @Override
    public void updateArrivalStatus(Long liftId, ArrivalDto arrivalDto) {
        Lift lift = liftRepository.findById(liftId).orElseThrow(() -> new RuntimeException("Lift not found"));
        Arrival arrival = new Arrival();
        arrival.setLiftId(lift.getId());
        arrival.setArUp(arrivalDto.isArUp());
        arrival.setArDown(arrivalDto.isArDown());
        arrival.setArrived(arrivalDto.getarrived());
        arrivalRepository.save(arrival);
    }
}