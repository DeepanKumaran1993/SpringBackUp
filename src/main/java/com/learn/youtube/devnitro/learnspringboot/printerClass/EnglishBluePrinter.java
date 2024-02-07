package com.learn.youtube.devnitro.learnspringboot.printerClass;

import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements com.learn.youtube.devnitro.learnspringboot.imple.BluePrinter {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Blue";
	}

}
