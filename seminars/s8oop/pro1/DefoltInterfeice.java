package org.example.seminars.s8oop.pro1;

public interface DefoltInterfeice {
    void printBankAccount();
    default void getUserName(){
        System.out.println("defolt");

    }
}
