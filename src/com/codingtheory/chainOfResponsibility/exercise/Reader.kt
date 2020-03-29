package com.codingtheory.chainOfResponsibility.exercise

import java.lang.UnsupportedOperationException


abstract class Reader(private val next: Reader?) {

    protected abstract fun doHandle(fileName: String): Document?

    protected abstract fun extension(): String

    fun read(fileName: String): Document? {
        if (fileName.endsWith(this.extension())) {
            return this.doHandle(fileName)
        }

        if (next == null) throw UnsupportedOperationException("File format not supported")

        return next.read(fileName)
    }
}