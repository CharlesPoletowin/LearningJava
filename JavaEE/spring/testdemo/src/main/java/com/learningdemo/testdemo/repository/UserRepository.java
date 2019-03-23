package com.learningdemo.testdemo.repository;

import com.learningdemo.testdemo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    //遵循spring data jpa命名标准
    User findByUsernameAndPassword(String username,String password);
}
