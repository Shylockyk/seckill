package com.shylock.seckill.service;

/**
 * @Author: yk
 * @Date: 2019/7/9 20:48
 */
public interface RedisService {

    Boolean exist(String key);

    Object get(String key);

    void set(String key, Object value);

    void setExpire(String key, int seconds, Object value);

    Boolean delete(String key);

    Long incr(String key);

    Long decr(String key);
}
