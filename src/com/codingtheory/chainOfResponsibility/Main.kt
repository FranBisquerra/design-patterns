package com.codingtheory.chainOfResponsibility

import com.codingtheory.chainOfResponsibility.exercise.DocumentReaderfactory

fun main() {

    val compressor = Compressor(null)
    val logger = Logger(compressor)
    val authenticator = Authenticator(logger)

    val server = WebServer(authenticator)

    server.handle(HttpRequest("admin", "1234"))

    val reader = DocumentReaderfactory.documentReader()
    var document = reader.read("file.xsl")
    println(document.toString())
    document = reader.read("file.numbers")
    println(document.toString())
    document = reader.read("file.qbw")
    println(document.toString())
    document = reader.read("file.notSupported")
}