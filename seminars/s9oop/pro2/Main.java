package org.example.seminars.s9oop.pro2;

import java.util.Collections;
import java.util.List;

/**
 * Создать классы cat и dog
 * для них создать класс AnimalShelter с наследниками для cat и dog
 * Добаветь возможность сравнения животных между собой и итерация по ним
 */
public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        for (int i = 0; i < 5; i++) {
            if(i % 2 == 0){
                shelter.addAnimal(new Cat("cat" + i, i * 2, i * 3));
            } else {
                shelter.addAnimal(new Dog("dog" + i, i * 2, i * 3));
            }

        }
        shelter.print();
        System.out.println("---");

        AnimalComparator comparator = new AnimalComparator();
        List result = shelter.getAnimals();

        Collections.sort(result, comparator);
        System.out.println(result);
        System.out.println("---");
        shelter.sort(new AnimalComparator());
        shelter.print();
    }
}
