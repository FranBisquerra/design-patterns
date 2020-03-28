package com.codingtheory.chainOfResponsibility

class Compressor(
        private val handler: Handler?
): Handler(handler) {
    override fun doHandle(request: HttpRequest): Boolean {
        println("request compressed")
        return true
    }
}