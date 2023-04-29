package org.example.seminars.s11oop.pro2O;

/**
 * Смысл в том чтоб не изменять уже написаный код а добавлять новое.
 * Накладовалось слоями
 */
public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 2.0);
        Calculator calc = new Calculator();
        calc.cailculateSwitch(add);
        System.out.println(add.getResult());
    }
}
