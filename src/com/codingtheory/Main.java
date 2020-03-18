package com.codingtheory;

import com.codingtheory.memento.Editor;
import com.codingtheory.memento.History;
import com.codingtheory.memento.document.Document;
import com.codingtheory.memento.document.DocumentHistory;

public class Main {

    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());

        var document = new Document("lorem ipsum", "roboto", 14);
        var documentHistory = new DocumentHistory();

        document.setContent("New LoremIpsum");
        documentHistory.push(document.createState());

        document.setFontName("arial");
        document.setFontSize(18);
        documentHistory.push(document.createState());

        document.setContent("Lorem impsum 2");
        document.restoreState(documentHistory.pop());

        System.out.println(document.toString());
    }
}
