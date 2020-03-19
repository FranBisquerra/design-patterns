package com.codingtheory.strategy.exercice;

public class DESEncryptor implements Encryptor {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
    }
}
