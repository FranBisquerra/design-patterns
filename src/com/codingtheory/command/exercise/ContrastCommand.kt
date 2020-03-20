package com.codingtheory.command.exercise

class ContrastCommand (
        private var history: History,
        private var videoEditor: VideoEditor
) : UndoableCommand {

    override fun execute() {
        videoEditor.contrastUp()
        history.push(this)
    }

    override fun unexecute() {
        videoEditor.contrastDown()
    }
}