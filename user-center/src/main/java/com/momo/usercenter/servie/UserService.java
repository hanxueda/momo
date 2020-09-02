package com.momo.usercenter.servie;

import com.momo.usercenter.domain.entity.user.User;

/**
 * @Author: hanxd
 * @Date: 2020-09-02 08:27
 */
public interface UserService {

    User getUserById(Integer id);
}
