package com.example.demo.bussineslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

//Field injection
//    @Autowired
//    private Product product;


//    setter-based dependency injection:
//    private Product product;
//
//    @Autowired
//    public void setProduct(Product product) {
//        this.product = product;
//    }

//    constructor-based injection.
    private final Product product;

    public Customer(Product product) {
        this.product = product;
    }
//
}
