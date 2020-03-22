package com.codingtheory.mediator

class ListBox(owner: DialogBox) : UiControl(owner) {

    var selection : String = ""
        set(value) {
            field = value
            owner.changed(this)
        }
}