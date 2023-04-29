package org.example.homework.h13oop.view;

import org.example.homework.h13oop.data.User;

import java.util.List;

public interface UserView<T extends User>{
        void sendOnConsole(List<T> list);

}
