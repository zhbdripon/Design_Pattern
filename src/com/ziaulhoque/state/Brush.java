package com.ziaulhoque.state;

public class Brush implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("draw a line");
    }
}
