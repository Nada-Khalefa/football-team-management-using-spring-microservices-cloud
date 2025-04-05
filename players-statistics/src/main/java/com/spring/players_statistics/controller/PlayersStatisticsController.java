package com.spring.players_statistics.controller;


import com.spring.players_statistics.config.PlayersStatisticsConfiguration;
import com.spring.players_statistics.model.PlayersStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players-management")
public class PlayersStatisticsController {

    @Autowired
    private PlayersStatisticsConfiguration playersStatisticsConfiguration;

    // localhost:8080/players-management/statistics
    @GetMapping("/statistics")
    public PlayersStatistics getPlayersStatistics(){

      return new PlayersStatistics(playersStatisticsConfiguration.getNumberTeams(),playersStatisticsConfiguration.getNumberPlayers(),playersStatisticsConfiguration.getCountry());
    }
}
