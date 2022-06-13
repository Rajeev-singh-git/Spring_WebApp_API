package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes") //It will search component in com.in28minutes and all it's sub package
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}

}

/*ComponentScan defines where it should look for component
 Service class is outside com.in28minutes.springboot package so it 
 won't be scanned automatically. So we need to add ComponentScan
 annotation telling  SpringBoot where to look for component.
 It is inside subpackage of ("com.in28minutes") so we added that.
 
 @SpringBootApplication adds @ComponentScan by default to current 
 package which in our case is (com.in28minutes.springboot;)
 */