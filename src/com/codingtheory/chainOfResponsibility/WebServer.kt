package com.codingtheory.chainOfResponsibility

class WebServer {
    fun handle(httpRequest: HttpRequest) {
        val authenticator = Authenticator()
        authenticator.authenticate(httpRequest)
    }
}