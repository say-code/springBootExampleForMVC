package com.example.springbootexampleformvc.service;

import com.example.springbootexampleformvc.model.User;

import java.util.List;

/**
 * @author sayCode
 * @date 2022/10/2 0:39
 * ProjectName: springBootExampleForMVC
 * Description: User service接口层
 */
public interface IUserService {

    /**
     * 查找所有用户信息
     * @return 用户信息列表
     */
    List<User> selectAllUsers();
}
