package com.codingtheory.command.exercise

class VideoEditor (
        private var label: String = "",
        private var contrast: Float = 0.5f
) {

    fun read(): String {
        return label
    }

    fun write(text: String) {
        this.label = text
    }

    fun contrastUp() {
        contrast += 0.1f
    }

    fun contrastDown() {
        contrast -= 0.1f
    }

    override fun toString(): String = "label: $label, contrast: $contrast"
}