package com.lift_control.liftcontrol.Controller;

import com.lift_control.liftcontrol.entity.Floor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lift_control.liftcontrol.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/floor")
public class FloorController {
	private static final Logger logger = LoggerFactory.getLogger(FloorController.class);
    @Autowired
    private FloorService floorService;
   
    @GetMapping
    public List<Floor> getAllFloors() {
        return floorService.getAllFloors();
    }

    @GetMapping("/{id}")
    public Floor getFloorById(@PathVariable Long id) {
        return floorService.getFloorById(id);
    }

    @PostMapping
    public Floor createFloor(@RequestBody Floor floor) {
        logger.info("Received request to create floor: {}", floor);
        Floor createdFloor = floorService.saveFloor(floor);
        logger.info("Created floor: {}", createdFloor);
        return createdFloor;
    }

    @DeleteMapping("/{id}")
    public void deleteFloor(@PathVariable Long id) {
        floorService.deleteFloor(id);
    }
}
