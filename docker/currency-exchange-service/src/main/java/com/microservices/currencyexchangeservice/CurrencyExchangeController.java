package com.microservices.currencyexchangeservice;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {


	Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

	@Autowired
	private Environment env;
		
	@Autowired
	private CurrencyExchangeRepository currExchangeRepo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange exchangeCurrency(@PathVariable String from , @PathVariable String to) {
		
		logger.info("Exchange Currency Called with {} to {}" , from , to);
		CurrencyExchange currencyExchange = currExchangeRepo.findByFromAndTo(from, to);
		if(Objects.isNull(currencyExchange)) {
			throw new RuntimeException("Data Not Available for " + from + " to "+ to);
		}
		currencyExchange.setEnvironment(env.getProperty("local.server.port") + " " + "v12" + " " + env.getProperty("HOSTNAME"));
		return currencyExchange;
	}
	
	
}
