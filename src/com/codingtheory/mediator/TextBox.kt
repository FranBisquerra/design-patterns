package com.codingtheory.mediator

class TextBox(owner: DialogBox) : UiControl(owner) {

    var content: String = ""
        set(value) {
            field = value
            owner.changed(this)
        }
}