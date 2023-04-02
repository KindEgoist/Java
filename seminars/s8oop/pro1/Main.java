package org.example.seminars.s8oop.pro1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.printBankAccount();
        user.getUserName();

        List<Cats> catsList = new ArrayList<>(); // массив объектов
        catsList.add(new Cats("Barsik", 10));
        System.out.println(catsList);
        Cats cats = new Cats("Barsik", 9); // объект
        cats.printBankAccount();

    }
}
