package com.codingtheory.chainOfResponsibility.exercise

object DocumentReaderfactory {

    fun documentReader(): Reader {
        val excelReader = ExcelReader(null)
        val numbersReader = NumbersReader(excelReader)
        return QuickBooksReader(numbersReader)
    }
}