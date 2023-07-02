package com.luv2code.springboot.okay.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // injecting properties for coach
    @Value("${coach.name}")
    private String coachName;
    @Value("${coach.team}")
    private String team;

    // expose "/" endpoint
    @GetMapping("/")
    public String sayHello(){
        return "Hello!";
    }

    // expose a workout endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "workout "+coachName+" "+team;
    }

    // expose a workout endpoint
    @GetMapping("/fortune")
    public String getFortune(){
        return "fortune";
    }

}
