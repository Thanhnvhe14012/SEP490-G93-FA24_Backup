package com.fpt.quickhire;

import com.fpt.quickhire.model.UserService;
import com.fpt.quickhire.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testDB {

    @Autowired
    private UserService userRepository;

    public void test(){
        User x = userRepository.findById(1);
        System.out.println(x);
    }
}
