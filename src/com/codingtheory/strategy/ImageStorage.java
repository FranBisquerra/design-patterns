package com.codingtheory.strategy;

public class ImageStorage {

    private String compressor;

    private String filter;


    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if (compressor == "jpeg") {
            System.out.println("Compressing using jpeg");
        } else if (compressor == "png") {
            System.out.println("Compressing using PNG");
        }

        if (filter == "b&w") {
            System.out.println("Applying b and w filter");
        } else if (filter == "high-contrast") {
            System.out.println("Applying high-contrast filter");
        }
    }
}
