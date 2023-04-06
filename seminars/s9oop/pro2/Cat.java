package org.example.seminars.s9oop.pro2;

public class Cat extends Animal{

    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }


    @Override
    public String toString() {
        return "Cat-" + this.getName() + " " + this.getWeight();
    }
}
