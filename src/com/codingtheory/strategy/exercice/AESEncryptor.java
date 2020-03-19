package com.codingtheory.strategy.exercice;

public class AESEncryptor implements Encryptor {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
