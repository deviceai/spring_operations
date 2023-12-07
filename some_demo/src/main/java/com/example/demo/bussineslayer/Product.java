package com.example.demo.bussineslayer;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String price;
    private boolean sold;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
