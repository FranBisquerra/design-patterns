package com.codingtheory.command.exercise

import java.util.*

class History (
        private val stack: ArrayDeque<UndoableCommand> = ArrayDeque()
) {

    fun push(command: UndoableCommand) = stack.push(command)

    fun pop(): UndoableCommand = stack.pop()

    fun size(): Int = stack.size
}