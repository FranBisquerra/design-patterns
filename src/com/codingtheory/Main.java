package com.codingtheory;

import com.codingtheory.iterator.BrowserHistory;

public class Main {

    public static void main(String[] args) {

        var browseHistory = new BrowserHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        for (var i = 0; i < browseHistory.getUrls().size(); i++) {
            System.out.println(browseHistory.getUrls().get(i));
        }
    }
}
