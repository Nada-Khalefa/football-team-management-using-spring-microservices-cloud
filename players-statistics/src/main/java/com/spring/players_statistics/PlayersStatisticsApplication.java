package com.spring.players_statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@EnableHystrix
public class PlayersStatisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayersStatisticsApplication.class, args);
	}

}
