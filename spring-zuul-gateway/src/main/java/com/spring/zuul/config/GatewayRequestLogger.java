package com.spring.zuul.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class GatewayRequestLogger implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
        String requestPath = exchange.getRequest().getURI().getPath();
        System.out.println("---> Request from: " + requestPath);
        return chain.filter(exchange); // continue processing
    }

    @Override
    public int getOrder() {
        return 1;
    }
}

/*
Football

localhost:4444/football-players/buy/BARCA/player/MDR

From Zuul Gateway
                       {service_name} / api
http://localhost:9055/football-players/football-players/buy/BARCA/player/MDR
-------------------------------------------------------------------------------------
Team

localhost:9999/team-players/team/ARC/player/PARIS
localhost:9999/team-players/teamProxy/ARC/player/PARIS

From Zuul Gateway

http://localhost:9055/team-service/team-players/team/ARC/player/PARIS
http://localhost:9055/team-service/team-players/teamProxy/ARC/player/PARIS
-------------------------------------------------------------------------------------
*/
