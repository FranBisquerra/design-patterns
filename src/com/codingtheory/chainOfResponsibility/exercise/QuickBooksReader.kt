package com.codingtheory.chainOfResponsibility.exercise

class QuickBooksReader(
        private val reader: Reader?
): Reader(reader) {

    override fun doHandle(fileName: String): Document? {
        return Document("QuickBooks file read")
    }

    override fun extension() = ".qbw"
}