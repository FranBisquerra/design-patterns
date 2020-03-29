package com.codingtheory.chainOfResponsibility.exercise

class ExcelReader(
        private val reader: Reader?
): Reader(reader) {

    override fun doHandle(fileName: String): Document? {
        return Document("Excel file read")
    }

    override fun extension() = ".xsl"
}