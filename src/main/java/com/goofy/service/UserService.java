package com.goofy.service;

import com.goofy.entity.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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

    User selectByName(String name , String password);

    boolean existUser(User user);

    User selectName(String user);

    Map<String, Object> loginValid(String name , String password, HttpServletRequest request);

}