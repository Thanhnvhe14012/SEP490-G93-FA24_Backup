package com.fpt.quickhire.model.impl;

import com.fpt.quickhire.entity.User;
import com.fpt.quickhire.model.UserService;
import com.fpt.quickhire.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }
}
