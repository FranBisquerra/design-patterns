package com.codingtheory.iterator.exersice;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public ProductIterator iterator() {
        return new ListProductIterator(this);
    }

    class ListProductIterator implements ProductIterator {

        private ProductCollection products;
        private int current;

        public ListProductIterator(ProductCollection products) {
            this.products = products;
        }

        @Override
        public boolean hasNext() {
            return current < products.products.size();
        }

        @Override
        public Product current() {
            return products.products.get(current);
        }

        @Override
        public void next() {
            current++;
        }
    }
}
