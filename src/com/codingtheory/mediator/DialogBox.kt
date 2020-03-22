package com.codingtheory.mediator

// Using an abstract class as in a real GUI framework this class would provide common behaviour for its descendants
abstract class DialogBox {

    abstract fun changed(uiControl: UiControl)
}