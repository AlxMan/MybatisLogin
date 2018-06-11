package com.goofy.dao;

import com.goofy.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/6/8 11:32
 * @Version 1.0
 */
public interface UserDao {
    /*
    　* @Description: 新增用户
    　* @User wangxianchao
    　* @date 2018/6/8 16:27
    */
    int insertUser(User user);
    /*
    　* @Description: 修改用户
    　* @User wangxianchao
    　* @date 2018/6/8 16:30 
    */
    int updatUser(User user);
    /*
    　* @Description: 删除用户
    　* @User wangxianchao
    　* @date 2018/6/8 16:30 
    */
    int deleteUser(User user);
    /*
     * @Description: 根据name查询用户
     * @User wangxianchao
     * @date 2018/6/8 16:30
     */
    User selectByName(User user);
}