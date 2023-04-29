package org.example.stepik;

import java.util.Scanner;

/**
 Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int summa = 0;
        for (int i = a; i <= b; i++) {
            summa += i;
        }
        System.out.println(summa);

    }
}
