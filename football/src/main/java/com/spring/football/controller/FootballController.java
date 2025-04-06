package com.spring.football.controller;

import com.spring.football.model.PlayerTeam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football-players")
public class FootballController {

    @GetMapping("/buy/{from}/player/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from, @PathVariable String to ){

        return new PlayerTeam(1,from,to, 500, 600);
    }
}
