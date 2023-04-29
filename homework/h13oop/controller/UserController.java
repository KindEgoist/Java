package org.example.homework.h13oop.controller;

import org.example.homework.h13oop.data.User;

import java.time.LocalDate;

public interface UserController <T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

}
