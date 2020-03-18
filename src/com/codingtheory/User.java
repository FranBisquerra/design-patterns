package com.codingtheory;

public class User {
    public String name;

    public User(String name, int age ) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hi, how are u! I'm " + this.name);
    }
}
