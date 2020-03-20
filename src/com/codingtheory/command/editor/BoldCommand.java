package com.codingtheory.command.editor;

public class BoldCommand implements UndoableCommand {

    private String prevContent;
    private HtmlDocument html;
    private History history;

    public BoldCommand(HtmlDocument html, History history) {
        this.html = html;
        this.history = history;
    }

    @Override
    public void unexecute() {
        html.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = html.getContent();
        html.makeBold();
        history.push(this);
    }
}
