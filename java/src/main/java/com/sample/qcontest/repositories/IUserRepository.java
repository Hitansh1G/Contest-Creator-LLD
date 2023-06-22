package com.sample.qcontest.repositories;

import java.util.List;
import java.util.Optional;

import com.sample.qcontest.entities.User;

public interface IUserRepository {
    User save(User user);
    List<User> findAll();
    Optional<User> findById(Long id);
    Optional<User> findByName(String name); 
}