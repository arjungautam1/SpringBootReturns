package com.laser.texas.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApp {
    @RequestMapping("/")
    public String show()
    {
        return "Welcome to the java World.";
    }
}
