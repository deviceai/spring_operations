package com.example.demo.bussineslayer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


public class HelloListenerOne implements ApplicationListener<HelloEvent> {

    @Override
    public void onApplicationEvent(HelloEvent event) {
        System.out.println("First listener handled the event, the message is " + event.getMessage());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("First listener ended to handle the event");

    }
}
