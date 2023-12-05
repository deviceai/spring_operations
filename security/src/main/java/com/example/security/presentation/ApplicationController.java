package com.example.security.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("rest/auth")
public class ApplicationController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to security demo application";
    }
}
