//package org.example.lectures.l9oop.Ex007;
//
//import java.util.Iterator;
//
//public class Coffee extends Lesson_09.Ex007.Beverage {
//
//    @Override
//    public Iterator<Ingredient> iterator() {
//
//        Iterator<Lesson_09.Ex007.Ingredient> it = new Iterator<Lesson_09.Ex007.Ingredient>() {
//
//            private int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public Lesson_09.Ex007.Ingredient next() {
//                return components.get(index++);
//            }
//
//        };
//        return it;
//
//    }
//
//}
