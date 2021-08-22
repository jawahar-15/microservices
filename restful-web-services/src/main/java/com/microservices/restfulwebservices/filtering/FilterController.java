package com.microservices.restfulwebservices.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {

	@GetMapping(path = "/filtering")
	public MappingJacksonValue getSome() {
		SomeClass someClass = new SomeClass("Name 1" , "Name 2" , "Name 3");
		MappingJacksonValue mapping = new MappingJacksonValue(someClass);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1" ,"field2");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeClassFilter", filter);
		mapping.setFilters(filterProvider);
		return mapping;
	}

	@GetMapping(path = "/filtering-one")
	public MappingJacksonValue getOne() {
		SomeClass someClass = new SomeClass("Name 1" , "Name 2" , "Name 3");
		MappingJacksonValue mapping = new MappingJacksonValue(someClass);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeClassFilter", filter);
		mapping.setFilters(filterProvider);
		return mapping;
	}

}
