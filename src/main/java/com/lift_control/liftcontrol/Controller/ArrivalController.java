package com.lift_control.liftcontrol.Controller;

import com.lift_control.liftcontrol.entity.Arrival;
import com.lift_control.liftcontrol.service.ArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/arrival")
public class ArrivalController {

    @Autowired
    private ArrivalService arrivalService;

    @GetMapping("/getarrival")
    public List<Arrival> getAllArrivals() {
        return arrivalService.getAllArrivals();
    }

    @GetMapping("/{id}")
    public Arrival getArrivalById(@PathVariable Long id) {
        return arrivalService.getArrivalById(id);
    }

    @PostMapping
    public Arrival createArrival(@RequestBody Arrival arrival) {
     return arrivalService.saveArrival(arrival);
     
    }

    @DeleteMapping("/{id}")
    public void deleteArrival(@PathVariable Long id) {
        arrivalService.deleteArrival(id);
    }
}
