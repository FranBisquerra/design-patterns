package com.codingtheory.observer

class ChartClass(private val dataSource: DataSource) : Observer {

    override fun update() {
        println("Chart updated ${dataSource.value}")
    }
}