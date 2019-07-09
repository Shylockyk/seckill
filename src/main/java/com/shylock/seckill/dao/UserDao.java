package com.shylock.seckill.dao;

import com.shylock.seckill.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: yk
 * @Date: 2019/7/9 19:39
 */

// 这里只能用mapper
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User selectUserById(int id);

    @Insert("insert into user(id,name) values(#{id},#{name})")
    int insertUser(User user);
}
