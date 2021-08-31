package com.learningspring.sfgdi.controllers;

import com.learningspring.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jose- on 8/17/2021
 **/

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
