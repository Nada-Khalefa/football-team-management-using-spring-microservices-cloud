package com.spring.players_statistics.controller;


//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.players_statistics.config.PlayersStatisticsConfiguration;
import com.spring.players_statistics.model.PlayersStatistics;
//import com.spring.players_statistics.service.SalaryService;
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/players-management")
public class PlayersStatisticsController {


    private Logger logger=
            LoggerFactory.getLogger(PlayersStatisticsController.class);


    @Autowired
    private PlayersStatisticsConfiguration playersStatisticsConfiguration;

    // localhost:8080/players-management/statistics
    @GetMapping("/statistics")
    public PlayersStatistics getPlayersStatistics(){

      return new PlayersStatistics(playersStatisticsConfiguration.getNumberTeams(),playersStatisticsConfiguration.getNumberPlayers(),playersStatisticsConfiguration.getCountry());
    }

    @GetMapping("/salary")
    //@HystrixCommand(fallbackMethod = "callBack")
    @Retry(name = "requestsTimes", fallbackMethod ="callBack" )
    public Integer getSalary(){
        logger.info("Request Done ...........");
        ResponseEntity<Integer> responseEntity=
                new RestTemplate().getForEntity(
                        "http://localhost:4758/salary",
                        Integer.class
                );
        return responseEntity.getBody();
//        return 1000;
    }

    public Integer callBack(Exception e){
        return 5000;
    }

}
