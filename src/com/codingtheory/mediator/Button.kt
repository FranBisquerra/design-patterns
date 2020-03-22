package com.codingtheory.mediator

class Button(owner: DialogBox) : UiControl(owner) {

    var isEnabled: Boolean = false
        set(value) {
            field = value
            owner.changed(this)
        }
}