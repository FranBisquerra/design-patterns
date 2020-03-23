package com.codingtheory.mediator.exercise

class TextBox : UiControl() {

    var value = ""
        set(value) {
            field = value
            notifyEvents()
        }
}