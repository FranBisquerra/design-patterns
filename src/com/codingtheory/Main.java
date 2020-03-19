package com.codingtheory;

import com.codingtheory.iterator.BrowseHistory;
import com.codingtheory.iterator.Iterator;

public class Main {

    public static void main(String[] args) {

        var browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        Iterator iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
