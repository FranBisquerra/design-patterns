package com.codingtheory.mediator.exercise

open class UiControl {

    private val eventHandlers: MutableList<EventHandler> = mutableListOf()

    fun attachEventHandler(eventHandler: EventHandler) {
        eventHandlers.add(eventHandler)
    }

    protected fun notifyEvents() = eventHandlers.forEach { it.handle() }
}