package com.sample.qcontest.repositories;

import java.util.List;
import java.util.Optional;

import com.sample.qcontest.entities.Level;
import com.sample.qcontest.entities.Question;

public interface IQuestionRepository {
    Question save(Question question);
    List<Question> findAll();
    Optional<Question> findById(Long id);
    List<Question> findAllQuestionLevelWise(Level level);
    Integer count();
}
