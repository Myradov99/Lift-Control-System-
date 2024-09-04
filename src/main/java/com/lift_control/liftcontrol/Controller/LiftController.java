package com.lift_control.liftcontrol.Controller;

import com.lift_control.liftcontrol.dto.LiftDto;

import com.lift_control.liftcontrol.service.LiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lift")
public class LiftController {

    @Autowired
    private LiftService liftService;

    @GetMapping
    public List<LiftDto> getAllLifts() {
        return liftService.getAllLifts();
    }

    @GetMapping("/{id}")
    public LiftDto getLiftById(@PathVariable Long id) {
        return liftService.getLiftById(id);
    }

    @PostMapping
    public LiftDto createLift(@RequestBody LiftDto liftDto) {
        return liftService.saveLift(liftDto);
    }

    @PutMapping("/{id}")
    public LiftDto updateLift(@PathVariable Long id, @RequestBody LiftDto liftDto) {
        return liftService.updateLift(id, liftDto);
    }

    @DeleteMapping("/{id}")
    public void deleteLift(@PathVariable Long id) {
        liftService.deleteLift(id);
    }

    @PostMapping("/{id}/moveUp")
    public LiftDto moveLiftUp(@PathVariable Long id) {
        return liftService.moveLiftUp(id);
    }

    @PostMapping("/{id}/open")
    public LiftDto openLift(@PathVariable Long id) {
        return liftService.openLift(id);
    }

    @PostMapping("/{id}/close")
    public LiftDto closeLift(@PathVariable Long id) {
        return liftService.closeLift(id);
    }
}