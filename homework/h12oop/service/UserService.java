package org.example.homework.h12oop.service;

import org.example.homework.h12oop.model.User;
import org.example.homework.h12oop.view.Messages;

public class UserService {
    public User createUser(int id, String name){
        return new User(id,name);
    }
    public void changeBalance(User user, int amount){
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}
