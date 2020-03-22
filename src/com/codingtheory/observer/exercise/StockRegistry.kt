package com.codingtheory.observer.exercise

import com.codingtheory.observer.Subject

class StockRegistry : Subject() {

    var stock1Price: Int = 0
        set(value) {
            field = value
            notifyObservers()
        }

    var stock2Price: Int = 0
        set(value) {
            field = value
            notifyObservers()
        }
}