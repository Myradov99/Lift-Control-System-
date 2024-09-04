package com.lift_control.liftcontrol.service;

import com.lift_control.liftcontrol.entity.StartMoving;
import java.util.List;

public interface StartMovingServiceInterface {
    List<StartMoving> getAllStartMovings();
    StartMoving getStartMovingById(Long id);
    StartMoving saveStartMoving(StartMoving startMoving);
    void deleteStartMoving(Long id);
}
