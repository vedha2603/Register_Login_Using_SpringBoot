package com.project.demo.service;

import com.project.demo.model.User;

public interface UserService {
    void saveUser(User user);
    User findByEmail(String email);
}
