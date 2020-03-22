package com.codingtheory.observer.exercise

import com.codingtheory.observer.Observer

class StockListView(private val stockRegistry: StockRegistry) : Observer {

    override fun update() {
        println("Stock list view reached ${stockRegistry.stock1Price} : ${stockRegistry.stock2Price}")
    }
}