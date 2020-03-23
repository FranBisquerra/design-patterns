package com.codingtheory.chainOfResponsibility

class Authenticator {

    fun authenticate(request: HttpRequest): Boolean {
        val isValid = request.username == "admin" && request.password == "1234"
        println("Authentication")
        return isValid
    }
}