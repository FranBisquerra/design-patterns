package com.codingtheory;

import com.codingtheory.state.BrushTool;
import com.codingtheory.state.Canvas;

public class Main {

    public static void main(String[] args) {

        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
