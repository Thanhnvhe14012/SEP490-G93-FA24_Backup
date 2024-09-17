package com.fpt.quickhire.model;

import com.fpt.quickhire.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserService extends JpaRepository<User, Long> {

    User findById(long id);

}
