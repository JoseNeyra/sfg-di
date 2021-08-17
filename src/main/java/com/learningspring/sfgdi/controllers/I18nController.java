package com.learningspring.sfgdi.controllers;

import com.learningspring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jose- on 8/17/2021
 **/

@Controller
public class I18nController {

    private final GreetingService greetingService;


    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
