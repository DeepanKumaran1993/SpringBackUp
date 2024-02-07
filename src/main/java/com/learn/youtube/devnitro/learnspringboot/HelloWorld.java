package com.learn.youtube.devnitro.learnspringboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.youtube.devnitro.learnspringboot.config.PizzaConfig;

@RestController

public class HelloWorld {

	@Autowired
	private PizzaConfig config;

	@GetMapping(path = "/h")
	public String home() {

		return config.toString();
	}

	@PostMapping(path = "/h/{id}")
	public String send(@PathVariable Integer id) {

		Map<Integer, String> namelist = Map.of(1, "deepan", 3, "hen", 5, "helen");

		return namelist.get(id);
		// System.out.println(id);
	}

}
