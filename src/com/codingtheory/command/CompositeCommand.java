package com.codingtheory.command;

import com.codingtheory.command.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
