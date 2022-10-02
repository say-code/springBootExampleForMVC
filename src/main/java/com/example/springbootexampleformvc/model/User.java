package com.example.springbootexampleformvc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sayCode
 * @date 2022/10/1 23:56
 * ProjectName: springBootExampleForMVC
 * Description: 用户 Model层
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //用户名
    @JsonIgnore
    private String username;

    //用户密码
    @JsonIgnore
    private String password;

    //真实姓名
    private String name;

    //用户Id
    private Integer userId;
}
