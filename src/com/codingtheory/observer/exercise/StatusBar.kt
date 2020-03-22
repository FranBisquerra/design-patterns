package com.codingtheory.observer.exercise

import com.codingtheory.observer.Observer

class StatusBar(private val stockRegistry: StockRegistry) : Observer {

    override fun update() {
        println("Status bar reached ${stockRegistry.stock1Price} : ${stockRegistry.stock2Price}")
    }
}