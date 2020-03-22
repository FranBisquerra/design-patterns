package com.codingtheory.observer

open class Subject {

    private val observers: MutableList<Observer> = mutableListOf()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        observers.forEach {
            it.update()
        }
    }
}