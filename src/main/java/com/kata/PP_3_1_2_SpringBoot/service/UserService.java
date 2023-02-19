package com.kata.PP_3_1_2_SpringBoot.service;

import com.kata.PP_3_1_2_SpringBoot.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> findAll();

    User findUser(Long id);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
