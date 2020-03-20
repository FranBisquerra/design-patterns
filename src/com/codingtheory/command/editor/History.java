package com.codingtheory.command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private Deque<UndoableCommand> undoableCommands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        undoableCommands.add(command);
    }

    public UndoableCommand pop() {
        return undoableCommands.pop();
    }

    public int size() {
        return undoableCommands.size();
    }
}
