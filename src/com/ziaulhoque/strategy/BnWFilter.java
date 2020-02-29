package com.ziaulhoque.strategy;

public class BnWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("applying black and white");
    }
}
