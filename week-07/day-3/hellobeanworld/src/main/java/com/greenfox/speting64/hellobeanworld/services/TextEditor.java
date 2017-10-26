package com.greenfox.speting64.hellobeanworld.services;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    @Autowired
    SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
