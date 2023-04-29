package org.example.seminars.s10oop.service;

import org.example.seminars.s10oop.model.User;
import org.example.seminars.s10oop.repository.UserRepo;


public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }
    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }
    public User getUserFromRepo(User user){
        return userRepo.getUserFromRepo(user);
    }

    public void addToRepo(User user){
        userRepo.addToRepo(user);
    }

}
