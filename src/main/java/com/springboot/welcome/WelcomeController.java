package com.springboot.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService service;

    @RequestMapping("welcome")
    public String displayMessage() {
        return service.getWelcomeMessage();
    }
}
