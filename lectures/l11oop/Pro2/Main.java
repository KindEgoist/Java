package org.example.lectures.l11oop.Pro2;

/**
 * Сложение двух чисел
 */

public class Main {
    public static void main(String[] args) {
//        var m = new SumModel();
//        var v = new View();
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClic();
        p.buttonClic();
        p.buttonClic();
    }
}
