package org.example.seminars.s11oop.pro1S;

/**
 * Смысол в том чтоб не сувать все в один класс. По возможности делить по функцилналу
 */
public class Main {
    public static void main(String[] args) {
        Text text = new Text("Мама мыла раму");
        Word word = new Word("раму");
        Word word1 = new Word("руки");

        WordReplacer wordReplacer = new WordReplacer();
        DeleterWord deleterWord = new DeleterWord();
        AppendText appendText = new AppendText();
        PrintWorld printWorld = new PrintWorld();

        printWorld.printText(text);
        Text text1 = new Text(wordReplacer.replaceWordInText(text, word, word1));
        printWorld.printText(text1);
        Text text2 = new Text(deleterWord.deleteWordInText(text, word));
        printWorld.printText(text2);
        Text text3 = new Text(appendText.appendText(text2, new Text(word.getWord() + "!")).getText());
        printWorld.printText(text3);

    }
}
