package com.codingtheory;

import com.codingtheory.state.Canvas;
import com.codingtheory.state.EraserTool;

public class Main {

    public static void main(String[] args) {

        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
