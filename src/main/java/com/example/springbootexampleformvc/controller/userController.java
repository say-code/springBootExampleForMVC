package com.example.springbootexampleformvc.controller;

import com.example.springbootexampleformvc.mapper.UserMapper;
import com.example.springbootexampleformvc.model.User;
import com.example.springbootexampleformvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sayCode
 * @date 2022/10/2 2:23
 * ProjectName: springBootExampleForMVC
 * Description: TODO
 */
@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    IUserService userService;

    @GetMapping("/select")
    public List<User> userSelect(){
        return userService.selectAllUsers();
    }
}
