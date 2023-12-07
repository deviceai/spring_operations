package com.example.demo.bussineslayer.mypizzeria;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaMenu {
    private final List<String> pizzas = List.of("margherita", "mushrooms and vegetables");

    public boolean isOnMenu(String name) {
        return pizzas.contains(name);
    }
}
