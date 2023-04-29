package org.example.seminars.s10oop.view;

import org.example.seminars.s10oop.controller.UserController;
import org.example.seminars.s10oop.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur data");
        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt());
        User user1 = new User(01, "Max", 20);
        userController.addUser(user1);
        System.out.println(userController.getUser(user1));
        userController.deleteUser(user1);
        System.out.println(userController.getUser(user1));

    }

}
