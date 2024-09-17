package com.fpt.quickhire.model.repository;

import com.fpt.quickhire.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

}
