package com.codingtheory.command;

import com.codingtheory.command.exercise.*;

public class Main {

    public static void main(String[] args) {
        var videoEditorHistory = new History();
        var videoEditor = new VideoEditor();

        System.out.println(videoEditor.toString());

        var contrastCommand = new ContrastCommand(videoEditorHistory, videoEditor);
        contrastCommand.execute();
        System.out.println(videoEditor.toString());
        var labelCommand = new LabelCommand(videoEditorHistory, videoEditor, "NewLabel");
        labelCommand.execute();
        System.out.println(videoEditor.toString());

        var videoEditorRollBack = new UndoCommand(videoEditorHistory);
        videoEditorRollBack.execute();
        System.out.println(videoEditor.toString());
        videoEditorRollBack.execute();
        System.out.println(videoEditor.toString());
    }
}
