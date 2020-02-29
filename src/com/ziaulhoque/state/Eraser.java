package com.ziaulhoque.state;

public class Eraser implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("eraser something");
    }
}
