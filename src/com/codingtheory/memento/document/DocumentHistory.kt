package com.codingtheory.memento.document

class DocumentHistory (
        private val history: MutableList<DocumentState> = mutableListOf()
) {
    fun push(documentState: DocumentState) {
        history.add(documentState)
    }

    fun pop(): DocumentState {
        val lastValue = history.last()
        history.removeAt(history.lastIndex)
        return lastValue
    }
}