package com.codingtheory.memento.document

class Document (
        var content: String,
        var fontName: String,
        var fontSize: Int
) {

    fun createState() = DocumentState(content, fontName, fontSize)

    fun restoreState(documentState: DocumentState) {
        this.content = documentState.content
        this.fontName = documentState.fontName
        this.fontSize = documentState.fontSize
    }

    override fun toString(): String = "content: ${content}, fontName: ${fontName}, fontSize: ${fontSize}"
}