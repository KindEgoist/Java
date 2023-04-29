package org.example.seminars.s11oop.pro1S;

public class FindWord {
    public Word findWord(Text text, Word word){
        String[] textArr = text.getText().split(" ");
        for (String el : textArr){
            if (el.equals(word)) return word;
        }
        return null;
    }
}
