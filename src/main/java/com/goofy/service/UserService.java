package com.goofy.service;

import com.goofy.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/6/8 11:31
 * @Version 1.0
 */
public interface UserService {

    int insertUser(User user);

    int updatUser(User user);

    int deleteUser(User user);

    User selectByName(User user);
}