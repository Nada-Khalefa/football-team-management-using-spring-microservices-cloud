package com.spring.zuul;

//import brave.sampler.Sampler;
import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableZuulProxy

public class SpringZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulGatewayApplication.class, args);
	}

	@Bean
	public Sampler sampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
