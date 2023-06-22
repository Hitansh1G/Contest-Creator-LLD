package com.crio.qcontest.services;

 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.crio.qcontest.constants.UserOrder;
import com.crio.qcontest.entities.User;
import com.crio.qcontest.repositories.ContestantRepository;
import com.crio.qcontest.repositories.IUserRepository;
import com.crio.qcontest.repositories.UserRepository;

public class UserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Complete the implementation of createUser method
    // Implementation must take care of the following cases:-
    // 1) Create and store user in the repository.

    public User createUser(String name) {
        // if(name==null){
        //     return 
        // }
        User user = new User(name);
        return userRepository.save(user);

    }

    // TODO: CRIO_TASK_MODULE_SERVICES
    // Complete the implementation of getAllUser method
    // Implementation must take care of the following cases:-
    // 1) Get all the users in ascending Order w.r.t score.
    // 2) Get all the users in descending Order w.r.t score.

    public List<User> getUsers(UserOrder userOrder) {

        // List<User>user=new ArrayList<>();
        // UserRepository bob = new UserRepository();
        // Map<Long,User>mp =bob.userMap;

        // for(Long i: mp.keySet() ){
        //     user.add(mp.get(i));
        // }
        
        List<User>user= userRepository.findAll();

        if(userOrder.name().equals(UserOrder.SCORE_ASC.name())){
            Collections.sort(user, new Comparator<User>() {
                @Override
                public int compare(User s1, User s2) {
                    return s1.getTotalScore()-s2.getTotalScore();
                } 
            });
        }
        else {
            Collections.sort(user,new Comparator<User>() {
                @Override
                public int compare(User s1, User s2) {
                    return s2.getTotalScore()-s1.getTotalScore();
                }
            });
        }
        return user;
    } 
    public int compare(User s1, User s2){
        return s1.getTotalScore()-s2.getTotalScore();
    }
}
