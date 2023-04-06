package org.example.stepik;

import java.util.Scanner;

/**
 По данному натуральному n вычислите сумму 12+22+...+n2
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = 0;
        while (a != 0){
            b = Math.pow((double) a, 2.0);
            a--;
        }
        System.out.println((int)b);

    }
}
