package com.lift_control.liftcontrol.service;
import org.springframework.transaction.annotation.Transactional;
import com.lift_control.liftcontrol.entity.Floor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lift_control.liftcontrol.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorService implements FloorServiceInterface  {
    private static final Logger logger = LoggerFactory.getLogger(FloorService.class);

    @Autowired
    private FloorRepository floorRepository;
    @Override
    public List<Floor> getAllFloors() {
        return floorRepository.findAll();
    }
    
    @Override
    public Floor getFloorById(Long id) {
        return floorRepository.findById(id).orElse(null);
    }
    @Override
    @Transactional
    public Floor saveFloor(Floor floor) {
        logger.info("Attempting to save floor: {}", floor);
        Floor savedFloor = floorRepository.save(floor);
        logger.info("Saved floor: {}", savedFloor);
        return savedFloor;
   
    }
    @Override
    public void deleteFloor(Long id) {
        floorRepository.deleteById(id);
    }
}
