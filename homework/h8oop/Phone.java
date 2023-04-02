package org.example.homework.h8oop;

public abstract class Phone implements HumanPhone{
    private int number;
    private String city;

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", city='" + city + '\'' +
                '}';
    }

    public Phone(int number, String city) {
        this.number = number;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void printSong(){
        System.out.println(number + city);
    }
    public void songEnd(){
        System.out.println("Звонок окончен");
    }
}
