package com.codingtheory.chainOfResponsibility

fun main() {

    val compressor = Compressor(null)
    val logger = Logger(compressor)
    val authenticator = Authenticator(logger)

    val server = WebServer(authenticator)

    server.handle(HttpRequest("admin", "1234"))
}