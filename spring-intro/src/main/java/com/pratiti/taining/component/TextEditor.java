package com.pratiti.taining.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("textEdit")
public class TextEditor {
	@Autowired      //DI
	private SpellChecker sp;
	public void load(String document) {
		System.out.println("Text editor loading document");
		//SpellChecker sp = new SpellChecker();
		//sp.checkSpellingMistake(document);
		
		sp.checkSpellingMistake(document);
	}
}
