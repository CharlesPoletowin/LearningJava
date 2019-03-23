package com.springlearning.login_demo.repository;

import com.springlearning.login_demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
