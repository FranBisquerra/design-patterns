package com.codingtheory.mediator

class ListBox : UiControl() {

    var selection : String = ""
        set(value) {
            field = value
            notifyEventHandlers()
        }
}