package com.greenfox.speting64.hellobeanworld.config;

import com.greenfox.speting64.hellobeanworld.services.TextEditor;
import com.greenfox.speting64.hellobeanworld.services.SpellChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }
}
