package com.lift_control.liftcontrol.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mycontroller {

    @GetMapping("/example")
    public String example() {
        return "This is an example endpoint";
    }
}
