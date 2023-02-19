package com.kata.PP_3_1_2_SpringBoot.dao;


import com.kata.PP_3_1_2_SpringBoot.models.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    List<User> allUsers();

    User getUser(Long id);

    void editUser(Long id, User user);

    void deleteUser(Long id);
}
