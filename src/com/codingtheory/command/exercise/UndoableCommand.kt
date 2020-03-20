package com.codingtheory.command.exercise

interface UndoableCommand : Command {

    fun unexecute()
}