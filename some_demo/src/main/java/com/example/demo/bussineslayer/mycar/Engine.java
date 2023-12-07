package com.example.demo.bussineslayer.mycar;

public class Engine {
    private String brand;
    private boolean isRunning;

    public Engine(String brand, boolean isRunning) {
        this.brand = brand;
        this.isRunning = isRunning;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
