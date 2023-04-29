package org.example.seminars.s11oop.pro1S;

public class WordReplacer {
    public String replaceWordInText(Text text, Word wordToReplace, Word newWord){
        String inputText = text.getText();
        if(inputText.contains(wordToReplace.getWord())){
            inputText = inputText.replace(wordToReplace.getWord(), newWord.getWord());

        } return inputText;
    }
}
