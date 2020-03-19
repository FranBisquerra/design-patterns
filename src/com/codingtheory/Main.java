package com.codingtheory;

import com.codingtheory.strategy.BlackAndWhiteFilter;
import com.codingtheory.strategy.ImageStorage;
import com.codingtheory.strategy.JpegCompressor;

public class Main {

    public static void main(String[] args) {

       var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
       imageStorage.store("file name");
    }
}
