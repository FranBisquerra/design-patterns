package com.codingtheory;

import com.codingtheory.command.*;
import com.codingtheory.command.editor.BoldCommand;
import com.codingtheory.command.editor.History;
import com.codingtheory.command.editor.HtmlDocument;
import com.codingtheory.command.editor.UndoCommand;
import com.codingtheory.command.framework.Button;

public class Main {

    public static void main(String[] args) {

        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        var history = new History();
        var html = new HtmlDocument();
        html.setContent("Hello World!");
        var boldCommand = new BoldCommand(html, history);
        System.out.println(html.getContent());
        boldCommand.execute();
        System.out.println(html.getContent());
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(html.getContent());
    }
}
