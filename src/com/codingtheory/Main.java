package com.codingtheory;

import com.codingtheory.mediator.ArticlesDialogBox;

public class Main {

    public static void main(String[] args) {

        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
