package org.example.lectures.l11oop.Pro1;

public class Sum implements SumInterfeice{
    public int a;
    public int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int summa() {
        return this.a + this.b;

    }

    @Override
    public String toString() {
        return "Sum{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
