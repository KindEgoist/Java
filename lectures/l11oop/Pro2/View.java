package org.example.lectures.l11oop.Pro2;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public int getValue(String title){
        System.out.printf("%s", title);
        return scanner.nextInt();
    }
    public void print(int data, String title){
        System.out.printf("%s %d\n", title, data);
    }
}
