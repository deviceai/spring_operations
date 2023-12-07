package com.example.demo.bussineslayer.mypizzeria;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DessertMenu {
    private final List<String> desserts = List.of("apple pie", "almond cake");

    public boolean isOnMenu(String name) {
        return desserts.contains(name);
    }
}
