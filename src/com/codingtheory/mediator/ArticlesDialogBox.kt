package com.codingtheory.mediator

class ArticlesDialogBox : DialogBox() {

    private val articleListBox = ListBox(this)
    private val titleTextBox = TextBox(this)
    private val saveButton = Button(this)

    fun simulateUserInteraction() {
        articleListBox.selection = "Article 1"
        println("TextBox: ${titleTextBox.content}")
        println("Button: ${saveButton.isEnabled}")
    }

    override fun changed(uiControl: UiControl) {
        when (uiControl) {
            articleListBox -> articleSelected()
            titleTextBox -> titleChanged()
        }
    }

    private fun titleChanged() {
        saveButton.isEnabled = !titleTextBox.content.isBlank()
    }

    private fun articleSelected() {
        titleTextBox.content = articleListBox.selection
        saveButton.isEnabled = true
    }
}