package com.codingtheory;

import com.codingtheory.mediator.ArticlesDialogBox;
import com.codingtheory.mediator.exercise.SignUpDialogBox;

public class Main {

    public static void main(String[] args) {

        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();

        var signUp = new SignUpDialogBox();
        signUp.simulateUser();
    }
}
