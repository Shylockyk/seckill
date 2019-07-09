package com.shylock.seckill.service;

import com.shylock.seckill.pojo.User;

/**
 * @Author: yk
 * @Date: 2019/7/9 19:40
 */
public interface UserService {

    User getUserById(int id);

    int addUser(User user);
}
