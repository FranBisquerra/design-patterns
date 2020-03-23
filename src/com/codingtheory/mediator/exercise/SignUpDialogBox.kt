package com.codingtheory.mediator.exercise

class SignUpDialogBox {

    private val button = Button()
    private val name = TextBox()
    private val pwd = TextBox()
    private val termsAndConditions = CheckBox()

    fun simulateUser() {
        name.value = "Pepe"
        pwd.value = "pwd"
        println("Name: ${name.value}, Pwd: ${pwd.value}, t&c: ${termsAndConditions.isEnabled} -> button: ${button.isEnabled}")
        termsAndConditions.isEnabled = true
        println("Name: ${name.value}, Pwd: ${pwd.value}, t&c: ${termsAndConditions.isEnabled} -> button: ${button.isEnabled}")
    }

    init {
        name.attachEventHandler(object : EventHandler {
            override fun handle() {
                toggleButton()
            }
        })
        
        pwd.attachEventHandler(object : EventHandler {
            override fun handle() {
                toggleButton()
            }
        })

        termsAndConditions.attachEventHandler(object : EventHandler {
            override fun handle() {
                toggleButton()
            }
        })
    }

    private fun toggleButton() {
        button.isEnabled = isButtonEnabled()
    }

    private fun isButtonEnabled() = !name.value.isBlank() && !pwd.value.isBlank() && termsAndConditions.isEnabled
}