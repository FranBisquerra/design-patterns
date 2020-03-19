package com.codingtheory;

import com.codingtheory.template.GenerateReportTask;
import com.codingtheory.template.TransferMoneyTask;
import com.codingtheory.template.exercise.SaveBeforeCloseWindow;

public class Main {

    public static void main(String[] args) {

        var task = new TransferMoneyTask();
        task.execute();

        var generateReportTask = new GenerateReportTask();
        generateReportTask.execute();

        var saveBeforeCloseWindow = new SaveBeforeCloseWindow();
        saveBeforeCloseWindow.close();
    }
}
