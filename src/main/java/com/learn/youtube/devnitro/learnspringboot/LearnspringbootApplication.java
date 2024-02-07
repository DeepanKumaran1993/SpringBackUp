package com.learn.youtube.devnitro.learnspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.learn.youtube.devnitro.learnspringboot.config.PizzaConfig;

@SpringBootApplication
@EnableConfigurationProperties(PizzaConfig.class)

public class LearnspringbootApplication implements CommandLineRunner {

//	private ColourPrinter colorprinter;
//
//	public LearnspringbootApplication(ColourPrinter colorprinter) {
//		this.colorprinter = colorprinter;
//	}
//	@Autowired
	private PizzaConfig pizzaConfig;

	public LearnspringbootApplication(PizzaConfig pizzaConfig) {
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearnspringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//System.out.println(colorprinter.print());
		System.out.println(String.format("i want %s  pizza and cheese is %s with the %s Topping ",pizzaConfig.getCheese(),pizzaConfig.getSauce(),pizzaConfig.getTopping()));
	//	System.out.println(pizzaConfig.toString());
		
//		Double j = 10.0 / 0.0;
//		System.out.println(j.isNaN() + "is nan");
//		System.out.println(j.isInfinite() + "is infinaite");
	}

}
