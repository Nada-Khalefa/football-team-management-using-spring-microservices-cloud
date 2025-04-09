package com.spring.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulGatewayApplication.class, args);
	}

}
