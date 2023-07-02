package com.luv2code.springboot.okay.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" endpoint
    @GetMapping("/")
    public String sayHello(){
        return "Hello!";
    }

    // expose a workout endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "workout";
    }

    // expose a workout endpoint
    @GetMapping("/fortune")
    public String getFortune(){
        return "fortune";
    }

}
