package com.in28minutes.springboot.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("UserCommandLineRunner");
	}

}
