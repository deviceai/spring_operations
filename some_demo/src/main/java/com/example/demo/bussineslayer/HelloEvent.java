package com.example.demo.bussineslayer;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class HelloEvent extends ApplicationEvent {

    private final String message;

    public HelloEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
