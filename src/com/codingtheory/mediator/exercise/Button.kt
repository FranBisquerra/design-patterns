package com.codingtheory.mediator.exercise

class Button : UiControl() {

    var isEnabled = false
        set(value) {
            field = value
            notifyEvents()
        }
}