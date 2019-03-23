package com.learningdemo.testdemo.controller;

import com.learningdemo.testdemo.domain.User;
import com.learningdemo.testdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index.action")
    public ModelAndView index(){
        return new ModelAndView("/index.html");
    }

    @RequestMapping("/user/register.action")
    public ModelAndView register(User user){
        System.out.println("function register is running...");
        userRepository.save(user);
        System.out.println(user.getUsername()+"///"+user.getPassword());
        return new ModelAndView("/index.html");
    }

    @RequestMapping("/user/login.action")
    public ModelAndView login(User user){
        System.out.println("function login is running...");
        User loginUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        System.out.println(user.getUsername()+"***"+user.getPassword());
        if (loginUser==null){
            return new ModelAndView("/index.html");
        }
        else{
            return new ModelAndView("/welcome.html");
        }
    }
}
