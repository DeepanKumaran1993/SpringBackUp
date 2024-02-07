package com.learn.youtube.devnitro.learnspringboot.printerClass;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.learn.youtube.devnitro.learnspringboot.imple.BluePrinter;
import com.learn.youtube.devnitro.learnspringboot.imple.ColourPrinter;
import com.learn.youtube.devnitro.learnspringboot.imple.GreenPrinter;
import com.learn.youtube.devnitro.learnspringboot.imple.RedPrinter;


@Component
public class ColourPrinterImplents implements ColourPrinter {

	private BluePrinter blueprinter;
	private GreenPrinter greenprinter;
	private RedPrinter redprinter;

	public ColourPrinterImplents(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
		this.blueprinter = bluePrinter;
		this.redprinter = redPrinter;
		this.greenprinter = greenPrinter;

	}

	@Override
	public String print() {
		// TODOuto-generated method stub
		return String.join(" ,", redprinter.print(), blueprinter.print(), greenprinter.print());
	}

}
