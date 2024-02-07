package com.learn.youtube.devnitro.learnspringboot.printerClass;

import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements com.learn.youtube.devnitro.learnspringboot.imple.RedPrinter {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Red";
	}

}
