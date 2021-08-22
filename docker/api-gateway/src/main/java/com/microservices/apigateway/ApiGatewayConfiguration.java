package com.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(route -> route.path("/get")
						.filters(header->header.addRequestHeader("myHeader", "Bin URI"))
						.uri("http://httpbin.org:80"))
				.route(route -> route.path("/currency-exchange/**")
						.uri("lb://currency-exchange/"))
				.route(route -> route.path("/currency-conversion/**")
						.uri("lb://currency-conversion/"))
				.route(route -> route.path("/currency-conversion-feign/**")
						.uri("lb://currency-conversion/"))
				.build();
	}
}
