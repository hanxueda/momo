package com.momo.usercenter.servie.impl;

import com.momo.usercenter.dao.user.UserMapper;
import com.momo.usercenter.domain.entity.user.User;
import com.momo.usercenter.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hanxd
 * @Date: 2020-09-02 08:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        System.out.println(id);
        return userMapper.selectByPrimaryKey(id);
    }
}
