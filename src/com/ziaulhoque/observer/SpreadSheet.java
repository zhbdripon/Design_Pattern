package com.ziaulhoque.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spread Sheet got notified");
    }
}
