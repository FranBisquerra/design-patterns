package com.codingtheory.command.exercise

class UndoCommand (
        private val history: History
) : Command {

    override fun execute() {
        if (history.size() > 0) history.pop().unexecute()
    }
}