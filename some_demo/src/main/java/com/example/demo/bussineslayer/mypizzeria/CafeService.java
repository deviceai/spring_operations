package com.example.demo.bussineslayer.mypizzeria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CafeService {
    private final PizzaMenu pizzaMenu;
    private final DessertMenu dessertMenu;

    @Autowired
    public CafeService(PizzaMenu pizzaMenu, DessertMenu dessertMenu) {
        this.pizzaMenu = pizzaMenu;
        this.dessertMenu = dessertMenu;
    }

    public String orderFood(String name) {
        if (pizzaMenu.isOnMenu(name) || dessertMenu.isOnMenu(name)) {
            System.out.println("Thanks for the order. Your " + name + " will be ready soon");
            return name;
        } else {
            System.out.println("We don't have such food on our menu");
            return null;
        }
    }
}
