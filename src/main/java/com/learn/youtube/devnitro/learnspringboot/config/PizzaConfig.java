package com.learn.youtube.devnitro.learnspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@ConfigurationProperties(prefix="pizza1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PizzaConfig {

//	public PizzaConfig(String sauce, String topping, String cheese) {
//		super();
//		this.sauce = sauce;
//		this.topping = topping;
//		this.cheese = cheese;
//	}
	private String sauce;
	private String topping;
	private String cheese;
	
	
}
