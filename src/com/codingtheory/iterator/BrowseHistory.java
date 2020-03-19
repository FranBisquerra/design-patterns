package com.codingtheory.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

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

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    class ListIterator implements Iterator {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
