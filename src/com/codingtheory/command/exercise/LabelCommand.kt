package com.codingtheory.command.exercise

class LabelCommand (
        private val history: History,
        private val videoEditor: VideoEditor,
        private val label: String
): UndoableCommand {

    private lateinit var prevLabel: String

    override fun execute() {
        prevLabel = videoEditor.read()
        videoEditor.write(label)
        history.push(this)
    }

    override fun unexecute() = videoEditor.write(prevLabel)
}