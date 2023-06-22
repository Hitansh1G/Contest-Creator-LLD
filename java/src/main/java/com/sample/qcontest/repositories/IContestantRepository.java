package com.sample.qcontest.repositories;

import java.util.List;
import java.util.Optional;

import com.sample.qcontest.entities.Contestant;

public interface IContestantRepository {
    Contestant save(Contestant contestant);
    Optional<Contestant> find(Long contestId, String userName);
    List<Contestant> findAllByContestId(Long contestId);
    void delete(Contestant contestant);
}