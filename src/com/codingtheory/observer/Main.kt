package com.codingtheory.observer

import com.codingtheory.observer.exercise.StatusBar
import com.codingtheory.observer.exercise.StockListView

import com.codingtheory.observer.exercise.StockRegistry




fun main() {

    val dataSource = DataSource()
    val sheet1 = SpreadSheet(dataSource)
    val sheet2 = SpreadSheet(dataSource)
    val chart = ChartClass(dataSource)

    dataSource.addObserver(sheet1)
    dataSource.addObserver(sheet2)
    dataSource.addObserver(chart)

    dataSource.value = 1

    val stockRegistry = StockRegistry()
    val statusBar = StatusBar(stockRegistry)
    val stockListView = StockListView(stockRegistry)

    stockRegistry.addObserver(statusBar)
    stockRegistry.addObserver(stockListView)

    stockRegistry.stock1Price = 2
    stockRegistry.stock2Price = 3
}