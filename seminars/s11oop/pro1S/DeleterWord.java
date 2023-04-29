package org.example.seminars.s11oop.pro1S;

public class DeleterWord {
    public String deleteWordInText(Text text, Word wordToDelete) {
        String inputText = text.getText();
        if (inputText.contains(wordToDelete.getWord())) {
            inputText = inputText.replace(wordToDelete.getWord(), "");
        }
        return inputText;
    }
}
