package com.ziaulhoque.strategy;

public class BlurFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("applying blur filter");
    }
}
