package com.momo.usercenter.controller;

import com.momo.usercenter.domain.entity.user.User;
import com.momo.usercenter.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hanxd
 * @Date: 2020-08-25 09:51
 */
@RestController
@RequestMapping("")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }
}
