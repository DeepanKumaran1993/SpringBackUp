package com.learn.youtube.devnitro.learnspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learn.youtube.devnitro.learnspringboot.imple.BluePrinter;
import com.learn.youtube.devnitro.learnspringboot.imple.ColourPrinter;
import com.learn.youtube.devnitro.learnspringboot.imple.GreenPrinter;
import com.learn.youtube.devnitro.learnspringboot.imple.RedPrinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.ColourPrinterImplents;
import com.learn.youtube.devnitro.learnspringboot.printerClass.EnglishBluePrinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.EnglishGreenPrinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.EnglishRedPrinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.FrenchBlueprinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.FrenchGreenprinter;
import com.learn.youtube.devnitro.learnspringboot.printerClass.FrenchRedprinter;

//@Primary
//@Configuration

public class PrinterConfig {

//	@Bean
	 public GreenPrinter greenPrinter() {
		return new FrenchGreenprinter();
	}

//    @Bean
    public RedPrinter redPrinter() {
		return new FrenchRedprinter();

	}
	
	//@Bean
	public BluePrinter bluePrinter() {
		return new FrenchBlueprinter();
		
	}
	
	
	
	@Bean 
	public ColourPrinter colourPrinter(BluePrinter bluePrinter,RedPrinter redPrinter,GreenPrinter greenPrinter) {
		return new ColourPrinterImplents(bluePrinter,redPrinter,greenPrinter);
	}
}
