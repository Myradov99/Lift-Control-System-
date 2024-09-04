package com.lift_control.liftcontrol.service;

import com.lift_control.liftcontrol.entity.Floor;
import java.util.List;

public interface FloorServiceInterface {
    List<Floor> getAllFloors();
    Floor getFloorById(Long id);
    Floor saveFloor(Floor floor);
    void deleteFloor(Long id);
}
