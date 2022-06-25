package com.in28minutes.springboot;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.service.WelcomeService;
import com.in28minutes.springboot.configuration.BasicConfiguration;


@RestController //Creates Rest controller
public class WelcomeController {
	
	@Autowired //It inject bean created by Spring.
	private WelcomeService service; //	private WelcomeService service = new  WelcomeService;
	
	@Autowired
	private BasicConfiguration configuration;
	
	@RequestMapping("/welcome") //maps the URL = http://localhost:8080/welcome
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
	@RequestMapping("/dynamic-configuration") //maps the URL = http://localhost:8080/welcome
	public Map dynamicConfiguration() {
		Map map = new HashMap(); 
		map.put("message", configuration.getMessage());
		map.put("number", configuration.getNumber());
		map.put("value", configuration.isValue());
		
		return map;
	}
   

}
