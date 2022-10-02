package com.example.springbootexampleformvc.mapper;

import com.example.springbootexampleformvc.model.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;


/**
 * @author sayCode
 * @date 2022/10/2 0:17
 * ProjectName: springBootExampleForMVC
 * Description: 用户 mapper层
 */
public interface UserMapper {
    /**
     * 查找所有用户信息
     * @return 用户信息列表
     */
    List<User> selectAllUser();


}
