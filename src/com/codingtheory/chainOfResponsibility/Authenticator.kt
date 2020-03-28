package com.codingtheory.chainOfResponsibility

class Authenticator(
        private val handler: Handler
): Handler(handler) {

    override fun doHandle(request: HttpRequest): Boolean {
        val isValid = request.username == "admin" && request.password == "1234"
        println("Authentication")
        return !isValid
    }
}