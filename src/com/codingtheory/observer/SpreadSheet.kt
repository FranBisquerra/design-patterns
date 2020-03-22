package com.codingtheory.observer

class SpreadSheet(private val dataSource: DataSource) : Observer {

    override fun update() {
        println("SpreadSheet got notified ${dataSource.value}")
    }
}