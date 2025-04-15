package com.spring.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p-> p.path("/get")
                        .filters(f->
                                f.addRequestHeader("sp-header", "the header")
                                 .addRequestParameter("sp-param","employee")
                        )
                        .uri("http://httpbin.org:80")
                )
                //http://localhost:9055/football-players/buy/BARCA/player/MDR
                .route(p-> p.path("/football-players/**")
                        .uri("lb://football-players/")
                )
                //http://localhost:9055/team-players/teamProxy/ARC/player/PARIS
                .route(p-> p.path("/team-players/**")
                        .uri("lb://team-service/")
                )
                //http://localhost:9055/team/teamProxy/ARC/player/PARIS
                .route(p -> p.path("/team/**")
                        .filters(f->
                                f.rewritePath("/team/","/team-players/")
                        )
                        .uri("lb://team-service/")
                )
                .build();

    }
















}
