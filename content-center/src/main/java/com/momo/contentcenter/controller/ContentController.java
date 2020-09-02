package com.momo.contentcenter.controller;

import com.momo.contentcenter.domain.dto.user.UserDto;
import com.momo.contentcenter.feignclient.UserCenterFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hanxd
 * @Date: 2020-09-02 08:31
 */
@RestController
@RequestMapping("content")
public class ContentController {

    @Autowired
    private UserCenterFeignClient userCenterFeignClient;

    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable("id") Integer id){
        return userCenterFeignClient.getUser(id);
    }
}
