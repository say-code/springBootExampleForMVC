package com.example.springbootexampleformvc.service.impl;

import com.example.springbootexampleformvc.mapper.UserMapper;
import com.example.springbootexampleformvc.model.User;
import com.example.springbootexampleformvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sayCode
 * @date 2022/10/2 0:41
 * ProjectName: springBootExampleForMVC
 * Description: TODO
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUsers() {
//        System.out.println(userMapper.selectAllUser().toString());
        return userMapper.selectAllUser();
    }


}
