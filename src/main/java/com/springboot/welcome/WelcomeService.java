package com.springboot.welcome;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String getWelcomeMessage() {
        return "Hello World!";
    }
}
