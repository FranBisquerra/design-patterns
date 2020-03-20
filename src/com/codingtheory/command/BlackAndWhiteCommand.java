package com.codingtheory.command;

import com.codingtheory.command.framework.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
