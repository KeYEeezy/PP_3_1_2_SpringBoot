package com.kata.PP_3_1_2_SpringBoot.service;

import com.kata.PP_3_1_2_SpringBoot.models.User;
import com.kata.PP_3_1_2_SpringBoot.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public UserServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void saveUser(User user) {
        peopleRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return peopleRepository.findAll();
    }

    @Override
    public User findUser(Long id) {
        Optional<User> findUser = peopleRepository.findById(id);
        return findUser.orElse(null);
    }

    @Override
    @Transactional
    public void updateUser(Long id, User updatedUser) {
        updatedUser.setId(id);
        peopleRepository.save(updatedUser);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        peopleRepository.deleteById(id);
    }
}
