package com.codingtheory.mediator

import com.codingtheory.mediator.exercise.SignUpDialogBox

fun main () {
    val dialog = ArticlesDialogBox()
    dialog.simulateUserInteraction()

    val signUp = SignUpDialogBox()
    signUp.simulateUser()
}