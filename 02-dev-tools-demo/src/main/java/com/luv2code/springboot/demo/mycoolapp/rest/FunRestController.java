package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "<h1>Hello World</h1>";
    }
    // expose workout endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "<h1>Run a hard 5k</h1>";
    }
    //  expose fortune endpoint
    @GetMapping("/fortune")
    public  String getDailyFortune(){
        return "<h1>Today is your Lucky Day.</h1>";
    }
}
