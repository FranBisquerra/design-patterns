package com.codingtheory.mediator.exercise

class CheckBox : UiControl() {

    var isEnabled = false
        set(value) {
            field = value
            notifyEvents()
        }
}