package com.codingtheory.strategy.exercice;

public class ChatClient {

    private Encryptor encryptionAlgorithm;

    public ChatClient(Encryptor encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        if (encryptionAlgorithm instanceof DESEncryptor || encryptionAlgorithm instanceof AESEncryptor) {
            encryptionAlgorithm.encrypt(message);
        } else {
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
        }

        System.out.println("Sending the encrypted message...");
    }
}
