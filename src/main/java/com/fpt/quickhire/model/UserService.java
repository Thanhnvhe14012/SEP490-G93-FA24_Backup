package com.fpt.quickhire.model;

import com.fpt.quickhire.entity.User;
import com.fpt.quickhire.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {
    User findUserById(long id) ;
}
