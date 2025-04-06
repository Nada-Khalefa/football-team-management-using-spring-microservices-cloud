package com.spring.Team.controller;

import com.spring.Team.model.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from,@PathVariable String to){

        Map<String, String> urlAttribute= new HashMap<>();
        urlAttribute.put("from", from);
        urlAttribute.put("to", to);
        // request to another service
        ResponseEntity<Team> teamResponseEntity= new RestTemplate().getForEntity(
                "http://localhost:8888/football-players/buy/{from}/player/{to}",
                Team.class,
                urlAttribute
        );

        // response of teamEntity
        Team teamResponse= teamResponseEntity.getBody();

        Team team= new Team(teamResponse.getId(),teamResponse.getFrom(), teamResponse.getTo(), teamResponse.getMoneyTeam(), "NONE","50");

        return team;
    }
}
