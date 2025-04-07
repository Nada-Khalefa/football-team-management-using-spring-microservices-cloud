package com.spring.Team.config;

import com.spring.Team.model.Team;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// name of service you need
// url of same service
//@FeignClient(name = "football-players",url = "localhost:8888")
@FeignClient(name = "football-players")
@RibbonClient(name = "football-players")
public interface ApiCall {

    @GetMapping("/football-players/buy/{from}/player/{to}")
    Team getFootballPlayer(@PathVariable String from, @PathVariable String to);
}
