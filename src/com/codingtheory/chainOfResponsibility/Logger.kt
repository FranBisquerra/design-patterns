package com.codingtheory.chainOfResponsibility

class Logger(
        private val handler: Handler?
): Handler(handler) {
    override fun doHandle(request: HttpRequest): Boolean {
        println("Log")
        return false
    }
}