package com.example.demo.bussineslayer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationListener {
    @EventListener
    public void handleEvent(HelloEvent event){
        System.out.println("The event occurred with the message " + event.getMessage());
    }
}
