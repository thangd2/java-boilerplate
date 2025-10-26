package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface UserService extends BaseService<User, Long> {
    Optional<User> findByEmail(String email);
    User authenticate(String email, String password);

}