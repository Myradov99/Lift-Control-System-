package com.lift_control.liftcontrol.service;


import com.lift_control.liftcontrol.entity.StartMoving;

import com.lift_control.liftcontrol.repository.StartMovingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartMovingService implements StartMovingServiceInterface{

    @Autowired
    private StartMovingRepository startMovingRepository;
    @Override
    public List<StartMoving> getAllStartMovings() {
        return startMovingRepository.findAll();
    }
    @Override
    public StartMoving getStartMovingById(Long id) {
        return startMovingRepository.findById(id).orElse(null);
    }
    @Override
    public StartMoving saveStartMoving(StartMoving startMoving) {
        return startMovingRepository.save(startMoving);
    }
    @Override
    public void deleteStartMoving(Long id) {
        startMovingRepository.deleteById(id);
    }
}
