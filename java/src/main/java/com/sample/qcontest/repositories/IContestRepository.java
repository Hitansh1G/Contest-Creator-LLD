package com.sample.qcontest.repositories;

import java.util.List;
import java.util.Optional;

import com.sample.qcontest.entities.Contest;
import com.sample.qcontest.entities.Level;

public interface IContestRepository {
    Contest save(Contest question);
    List<Contest> findAll();
    Optional<Contest> findById(Long id);
    List<Contest> findAllContestLevelWise(Level level);    
}
