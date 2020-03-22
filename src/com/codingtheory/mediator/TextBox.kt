package com.codingtheory.mediator

class TextBox : UiControl() {

    var content: String = ""
        set(value) {
            field = value
            notifyEventHandlers()
        }
}