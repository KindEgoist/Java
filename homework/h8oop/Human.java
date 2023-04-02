package org.example.homework.h8oop;

public class Human extends Phone {
    public String name;

    public Human(int number, String city, String name) {
        super(number, city);
        this.name = name;
    }

    @Override
    public void printSong() {
        System.out.println("Звонит: " + name + " Номер: " + getNumber() + " Город: " + getCity());
    }
}