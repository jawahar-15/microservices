package com.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	Environment env;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConv(@PathVariable(name="from") String from, @PathVariable(name="to") String to ,
			@PathVariable(name="quantity") BigDecimal quantity) {
		HashMap<String,String> uriParams = new HashMap<>();
		uriParams.put("from", from);
		uriParams.put("to", to);
		ResponseEntity<CurrencyConversion> response= restTemplate.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class,uriParams);
		CurrencyConversion currConvo = response.getBody();
		currConvo.setTotalCalculatedAmount(quantity.multiply(currConvo.getConversionMultiple()));
		currConvo.setQuantity(quantity);
		return currConvo;
	}

	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConvFeign(@PathVariable(name="from") String from, @PathVariable(name="to") String to ,
			@PathVariable(name="quantity") BigDecimal quantity) {
		CurrencyConversion currConvo = proxy.exchangeCurrency(from, to);
		currConvo.setTotalCalculatedAmount(quantity.multiply(currConvo.getConversionMultiple()));
		currConvo.setQuantity(quantity);
		return currConvo;
	}

}
