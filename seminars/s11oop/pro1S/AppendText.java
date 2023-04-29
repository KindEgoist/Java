package org.example.seminars.s11oop.pro1S;

public class AppendText {
    public Text appendText(Text currentText, Text newText){
        return new Text(currentText.getText() + newText.getText());

    }

}
