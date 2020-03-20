package com.codingtheory.command.editor;

public interface UndoableCommand extends Command {

    void unexecute();
}
