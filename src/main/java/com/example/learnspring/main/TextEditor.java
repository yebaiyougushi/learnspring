package com.example.learnspring.main;
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(){

    }
    public TextEditor(SpellChecker spellChecker) {
//        System.out.println("Inside TextEditor constructor." );
//        this.spellChecker = spellChecker;
    }
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}