package com.codingtheory.chainOfResponsibility.exercise

class NumbersReader(
        private val reader: Reader?
): Reader(reader) {

    override fun doHandle(fileName: String): Document? {
        return Document("Number file read")
    }

    override fun extension() = ".numbers"
}