package com.codingtheory.strategy;

import com.codingtheory.strategy.exercice.ChatClient;
import com.codingtheory.strategy.exercice.DESEncryptor;

public class Main {

    public static void main(String[] args) {

        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("file name");

        var chat = new ChatClient(new DESEncryptor());
        chat.send("message");
    }
}
