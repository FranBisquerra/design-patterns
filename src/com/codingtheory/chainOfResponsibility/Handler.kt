package com.codingtheory.chainOfResponsibility

abstract class Handler(private val next: Handler?) {

    abstract fun doHandle(request: HttpRequest): Boolean

    fun handle(request: HttpRequest) {
        if (doHandle(request)) return
        next?.handle(request)
    }
}