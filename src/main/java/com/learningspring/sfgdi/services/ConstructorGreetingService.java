package com.learningspring.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jose- on 8/17/2021
 **/

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World --- Constructor";
    }
}
