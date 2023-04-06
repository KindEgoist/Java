package org.example.seminars.s9oop.pro1;

import java.util.Iterator;
import java.util.List;

public class CatIterator implements Iterator<Cat> {

    private int counter;
    private List<Cat> cats;
    public CatIterator(List<Cat> cats) {
        this.counter = 0;
        this.cats = cats;
    }

    @Override
    public boolean hasNext() {
        if (counter < cats.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Cat next() {
        return cats.get(counter++);
    }
}
