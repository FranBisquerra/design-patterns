package com.codingtheory.mediator

class ArticlesDialogBox {

    private val articleListBox = ListBox()
    private val titleTextBox = TextBox()
    private val saveButton = Button()

    init {
        articleListBox.addEventHandler(object : EventHandler {
            override fun handle() {
                articleSelected()
            }
        })
        titleTextBox.addEventHandler(object : EventHandler {
            override fun handle() {
                titleChanged()
            }

        })
    }

    fun simulateUserInteraction() {
        articleListBox.selection = "Article 1"
        println("TextBox: ${titleTextBox.content}")
        println("Button: ${saveButton.isEnabled}")
    }

    private fun titleChanged() {
        saveButton.isEnabled = !titleTextBox.content.isBlank()
    }

    private fun articleSelected() {
        titleTextBox.content = articleListBox.selection
        saveButton.isEnabled = true
    }
}