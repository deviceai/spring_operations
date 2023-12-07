package com.example.springbootdocker.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to the app";
    }
}
