package com.codingtheory;

import com.codingtheory.observer.ChartClass;
import com.codingtheory.observer.DataSource;
import com.codingtheory.observer.SpreadSheet;
import com.codingtheory.observer.exercise.StatusBar;
import com.codingtheory.observer.exercise.StockListView;
import com.codingtheory.observer.exercise.StockRegistry;

public class Main {

    public static void main(String[] args) {

        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new ChartClass(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        var stockRegistry = new StockRegistry();
        var statusBar = new StatusBar(stockRegistry);
        var stockListView = new StockListView(stockRegistry);

        stockRegistry.addObserver(statusBar);
        stockRegistry.addObserver(stockListView);

        stockRegistry.setStock1Price(2);
        stockRegistry.setStock2Price(3);
    }
}
