package com.codingtheory.observer

class DataSource : Subject() {

    var value: Int = 0
        set(value) {
            field = value
            notifyObservers()
        }
}