package com.ziaulhoque.state;

public class Selection implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a rectangle");
    }
}
