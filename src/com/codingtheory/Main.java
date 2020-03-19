package com.codingtheory;

import com.codingtheory.template.GenerateReportTask;
import com.codingtheory.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

        var task = new TransferMoneyTask();
        task.execute();

        var generateReportTask = new GenerateReportTask();
        generateReportTask.execute();
    }
}
