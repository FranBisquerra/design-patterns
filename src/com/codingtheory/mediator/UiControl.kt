package com.codingtheory.mediator

open class UiControl {

    private val eventsHandlers: MutableList<EventHandler> = mutableListOf()

    fun addEventHandler(observer: EventHandler) = eventsHandlers.add(observer)

    protected fun notifyEventHandlers() = eventsHandlers.forEach { it.handle() }
}