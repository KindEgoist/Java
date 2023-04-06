package org.example.seminars.s9oop.pro1;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelder cats = new CatShelder(List.of(new Cat("name1"), new Cat("name2")));

        for (Cat el : cats){
            System.out.println(el);
        }
        cats.getSize();

        Iterator<Cat> iterator = cats.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }


    }
}
