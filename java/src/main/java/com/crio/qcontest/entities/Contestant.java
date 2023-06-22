package com.crio.qcontest.entities;

import java.util.LinkedList;
import java.util.List;
import com.crio.qcontest.repositories.ContestRepository;
import com.crio.qcontest.repositories.UserRepository;

public class Contestant {
    private final User user;
    private final Contest contest;
    private Integer currentContestPoints;
    private final List<Question> attemptedQuestions;

    public Contestant(User user, Contest contest) {
        this.user = user;
        this.contest = contest;
        this.currentContestPoints = 0;
        this.attemptedQuestions = new LinkedList<Question>();
    }

    // public Contestant(Long contestId, String userName) {
    //     return null; 
    // }




    // public Contestant(UserRepository name, ContestRepository con) {
    //     this.name = name;
    //     this.con = con;

    // }

    public User getUser() {
        return user;
    }

    public Contest getContest() {
        return contest;
    }

    public Integer getCurrentContestPoints() {
        return currentContestPoints;
    }
    
    public void addQuestion(Question question){
    // Add the Questions attempted by the Contestant in the List.
        attemptedQuestions.add(question);
    // Add the score obtained for the question attempted.
        currentContestPoints += question.getScore();
    
    }

    @Override
    public String toString() {
        return "Contestant [user=" + user.getName() + ", contest=" + contest.getId() + 
        ", currentContestPoints=" + currentContestPoints + ", attemptedQuestions=" + attemptedQuestions + "]";
    }  
}
