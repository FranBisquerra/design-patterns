package com.codingtheory;

import com.codingtheory.iterator.BrowseHistory;
import com.codingtheory.iterator.Iterator;
import com.codingtheory.iterator.exersice.Product;
import com.codingtheory.iterator.exersice.ProductCollection;
import com.codingtheory.iterator.exersice.ProductIterator;

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

        var products = new ProductCollection();
        products.add(new Product(1, "first"));
        products.add(new Product(2, "second"));
        products.add(new Product(3, "third"));

        ProductIterator it = products.iterator();
        while (it.hasNext()) {
            System.out.println(it.current().toString());
            it.next();
        }
    }
}
