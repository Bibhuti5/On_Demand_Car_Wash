package Apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class config {
	@Bean
public RouteLocator allroutes(RouteLocatorBuilder route) {
	return route.routes()
			.route(customer->customer
		    .path("/user/*")
		    .uri("http://localhost:8080"))
			
			.route(Admin->Admin
			.path("/admin/*")
			.uri("http://localhost:8081"))
			
			.route(washer->washer 
			.path("/wash/*")
			.uri("http://localhost:8082"))
			
			.route(order->order 
			.path("/order/*")
			.uri("http://localhost:8083"))
			
			.route(pay->pay 
			.path("/gateway/*")
			.uri("http://localhost:1234"))
		    .build();
	
}

}