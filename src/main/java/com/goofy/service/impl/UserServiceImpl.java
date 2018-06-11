package com.goofy.service.impl;

import com.goofy.service.UserService;
import com.goofy.dao.UserDao;
import com.goofy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/6/8 11:32
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int updatUser(User user) {
        return userDao.updatUser(user);
    }

    @Override
    public int deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    @Override
    public User selectByName(User user) {
        return userDao.selectByName(user);
    }


}