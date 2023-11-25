package com.thejitenpatel.user.service.services;

import com.thejitenpatel.user.service.enitites.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);
}
