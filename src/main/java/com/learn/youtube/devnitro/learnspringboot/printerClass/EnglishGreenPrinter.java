package com.learn.youtube.devnitro.learnspringboot.printerClass;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements com.learn.youtube.devnitro.learnspringboot.imple.GreenPrinter {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "Green";
		
	}

}
