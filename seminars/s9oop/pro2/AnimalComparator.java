package org.example.seminars.s9oop.pro2;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return -o1.getWeight().compareTo(o2.getWeight());
    }
}
