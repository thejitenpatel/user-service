package com.thejitenpatel.user.service.services.impl;

import com.thejitenpatel.user.service.enitites.User;
import com.thejitenpatel.user.service.exceptions.ResourceNotFoundException;
import com.thejitenpatel.user.service.repositories.UserRepository;
import com.thejitenpatel.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found by is " + userId));
    }
}
