package com.shylock.seckill.controller;

import com.shylock.seckill.pojo.User;
import com.shylock.seckill.result.Result;
import com.shylock.seckill.service.RedisService;
import com.shylock.seckill.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: yk
 * @Date: 2019/7/9 16:56
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserService userServiceImpl;

    @Resource
    private RedisService redisServiceImpl;

    @RequestMapping("/test1")
    public Result<String> test1() {
        return Result.success("shylock");
    }

    @RequestMapping("/getUser")
    public Result<User> getUser(int id) {
        User user = userServiceImpl.getUserById(id);
        return Result.success(user);
    }

    @RequestMapping("/testRedis")
    public Result<String> testRedis(String key, String value) {
        redisServiceImpl.set(key, value);
        return Result.success("..");
    }

    @RequestMapping("/testRedis1")
    public Result<String> testRedis1(String key) {
        return Result.success((String) redisServiceImpl.get(key));
    }


    @RequestMapping("/testRedis2")
    public Result<String> testRedis2(String key) {
        User u = userServiceImpl.getUserById(1);
        redisServiceImpl.set(key, u);
        return Result.success("user");
    }

    @RequestMapping("/testRedis3")
    public Result<User> testRedis3(String key) {
        return Result.success((User) redisServiceImpl.get(key));
    }
}
