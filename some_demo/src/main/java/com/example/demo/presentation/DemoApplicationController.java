package com.example.demo.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class DemoApplicationController {

    @GetMapping("/")
    public String welcome (){
        return "Welcome to the web page";
    }
}
