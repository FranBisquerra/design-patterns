package com.codingtheory.template.exercise;

public class SaveBeforeCloseWindow extends Window {

    @Override
    protected void beforeClose() {
        System.out.println("Saving content");
    }

    @Override
    protected void afterClose() {

    }
}
