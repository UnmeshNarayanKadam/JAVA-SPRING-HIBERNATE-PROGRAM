package com.pratiti.taining.component;

import org.springframework.stereotype.Component;

@Component("spellCheck")
public class SpellChecker {
	public void checkSpellingMistake(String document) {
		System.out.println("Spell checker checking mistake");
	}
}
