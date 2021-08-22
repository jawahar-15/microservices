package com.microservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.MessageSourceProperties;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	MessageSource messageSource;
	
	@GetMapping(path= "/hello-world")
	private String getWorld(@RequestHeader (name = "Actual-language" , required = false) Locale locale) {
		return messageSource.getMessage("text.value", null,"Default-Message" ,locale);
	}
}
