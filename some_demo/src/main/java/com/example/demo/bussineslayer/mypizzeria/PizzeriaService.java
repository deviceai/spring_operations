package com.example.demo.bussineslayer.mypizzeria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzeriaService {
    private final PizzaMenu pizzaMenu;

    @Autowired
    public PizzeriaService(PizzaMenu pizzaMenu) {
        this.pizzaMenu = pizzaMenu;
    }

    public String orderPizza(String name) {
        if (pizzaMenu.isOnMenu(name)) {
            System.out.println("Thanks for the order! Your pizza will be ready in 15 minutes");
            return name;
        } else {
            System.out.println("We don't have such pizza on our menu");
            return null;
        }
    }
}
