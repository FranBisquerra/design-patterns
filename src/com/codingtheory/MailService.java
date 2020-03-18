package com.codingtheory;

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("conecting...");
    }

    private void disconnect() {
        System.out.println("disconeting...");
    }

    private void authenticate() {
        System.out.println("authenticating...");
    }
}
