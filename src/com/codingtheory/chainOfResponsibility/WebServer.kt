package com.codingtheory.chainOfResponsibility

class WebServer(
        private val handler: Handler?
) {

    fun handle(httpRequest: HttpRequest) {
        handler?.handle(httpRequest)
    }
}