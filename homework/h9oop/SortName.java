package org.example.homework.h9oop;

import java.util.Comparator;

public class SortName implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getName().compareTo(product2.getName());
    }
}
