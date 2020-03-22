package com.codingtheory.mediator

class Button : UiControl() {

    var isEnabled: Boolean = false
        set(value) {
            field = value
            notifyEventHandlers()
        }
}