package com.codingtheory.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lasIndex = urls.size() -1;
        var lastUrl = urls.get(lasIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
