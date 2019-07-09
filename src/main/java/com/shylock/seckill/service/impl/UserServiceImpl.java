package com.shylock.seckill.service.impl;

import com.shylock.seckill.dao.UserDao;
import com.shylock.seckill.pojo.User;
import com.shylock.seckill.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: yk
 * @Date: 2019/7/9 19:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int id) {
        return userDao.selectUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.insertUser(user);
    }
}
