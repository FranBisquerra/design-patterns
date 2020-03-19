package com.codingtheory.strategy;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying b and w filter");
    }
}
