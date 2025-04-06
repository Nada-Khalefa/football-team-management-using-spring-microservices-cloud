package com.spring.Team.controller;

import com.spring.Team.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from,@PathVariable String to){

        Team team= new Team(1,from, to, 100, "NONE","50");

        return team;
    }
}
