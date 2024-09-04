package com.lift_control.liftcontrol.Controller;

import com.lift_control.liftcontrol.entity.StartMoving;
import com.lift_control.liftcontrol.service.StartMovingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/startmoving")
public class StartMovingController {

    @Autowired
    private StartMovingService startMovingService;

    @GetMapping
    public List<StartMoving> getAllStartMovings() {
        return startMovingService.getAllStartMovings();
    }

    @GetMapping("/{id}")
    public StartMoving getStartMovingById(@PathVariable Long id) {
        return startMovingService.getStartMovingById(id);
    }

    @PostMapping()
    public StartMoving createStartMoving(@RequestBody StartMoving startMoving) {
        return startMovingService.saveStartMoving(startMoving);
    }

    @DeleteMapping("/{id}")
    public void deleteStartMoving(@PathVariable Long id) {
        startMovingService.deleteStartMoving(id);
    }
}
