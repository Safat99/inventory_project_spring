package com.example.inventory_project.service;

import com.example.inventory_project.entity.User;
import com.example.inventory_project.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /////////////////////////////// create operation /////////////////////////////////////////
    public User addUser(User user){
        return userRepository.save(user);
    }
}
