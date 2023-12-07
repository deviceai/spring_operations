package com.example.demo.bussineslayer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class HelloListenerTwo implements ApplicationListener<HelloEvent> {

    @Override
    public void onApplicationEvent(HelloEvent event) {
        System.out.println("Second listener handled the event, the message is " + event.getMessage());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Second listener ended to handle the event");
    }
}
