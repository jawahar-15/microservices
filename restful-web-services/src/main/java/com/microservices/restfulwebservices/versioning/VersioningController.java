package com.microservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	// Normal URI  Versioning
	@GetMapping("/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Jawahar Sridharan");
	}
	
	@GetMapping("/person/new")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Jawahar" , "Sridharan"));
	}

	// Request Param Versioning
	@GetMapping(value = "/person/params" , params = "version=1")
	public PersonV1 getParamV1() {
		return new PersonV1("Jawahar Sridharan");
	}
	
	@GetMapping(value = "/person/params" , params = "version=2")
	public PersonV2 getParamV2() {
		return new PersonV2(new Name("Jawahar" , "Sridharan"));
	}
	
	// Headers Versioning / Custom Header Versioning
	@GetMapping(value = "/person/headers" , headers = "X-API-VERSION=1")
	public PersonV1 getHeaderV1() {
		return new PersonV1("Jawahar Sridharan");
	}
	
	@GetMapping(value = "/person/headers" , headers = "X-API-VERSION=2")
	public PersonV2 getHeaderV2() {
		return new PersonV2(new Name("Jawahar" , "Sridharan"));
	}

	// Produces Versioning / Accept Header Versioning / Media Type / Mime Type Versioning / Content Negotiation
	@GetMapping(value = "/person/produces" , produces = "application/person-v1+json")
	public PersonV1 getProducersV1() {
		return new PersonV1("Jawahar Sridharan");
	}
	
	@GetMapping(value = "/person/produces" , produces = "application/person-v2+json")
	public PersonV2 getProducersV2() {
		return new PersonV2(new Name("Jawahar" , "Sridharan"));
	}

}
