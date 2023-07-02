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


}
