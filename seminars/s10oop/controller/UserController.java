package org.example.seminars.s10oop.controller;

import org.example.seminars.s10oop.model.User;
import org.example.seminars.s10oop.service.UserService;

public class UserController {
    private final UserService userService = new UserService();
    public void saveNewUser(Integer userID, String name, Integer age){
        userService.saveUser(new User(userID, name, age));
    }
    public void deleteUser(User user){
        userService.deleteFromRepo(user);
    }
    public User getUser(User user){
        return userService.getUserFromRepo(user);
    }
    public void addUser(User user){
        userService.addToRepo(user);
    }

}
