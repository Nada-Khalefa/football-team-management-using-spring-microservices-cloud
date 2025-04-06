package com.spring.football.dao;

import com.spring.football.model.PlayerTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerTeamDao extends JpaRepository<PlayerTeam, Long> {

    PlayerTeam findByFromAndTo (String from, String to);
}
