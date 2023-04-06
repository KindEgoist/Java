package org.example.seminars.s9oop.pro1;

import java.util.Iterator;
import java.util.List;

public class CatShelder implements Iterable<Cat>{
    private List<Cat> cats;
    public CatShelder(List<Cat> cats){
        this.cats = cats;
    }
    public void getSize(){
        System.out.println(cats.size());

    }
    @Override
    public Iterator<Cat> iterator() {
        return new CatIterator(cats);
    }
}
