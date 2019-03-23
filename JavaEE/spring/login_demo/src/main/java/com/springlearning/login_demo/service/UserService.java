package com.springlearning.login_demo.service;

import com.springlearning.login_demo.domain.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface UserService {
    void save(User user);
    boolean login(User user);
    List<User> findAll();
    User findById(Long id);
}
