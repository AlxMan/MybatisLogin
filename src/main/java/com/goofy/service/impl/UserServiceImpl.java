package com.goofy.service.impl;

import com.goofy.service.UserService;
import com.goofy.dao.UserDao;
import com.goofy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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
    public User selectByName(String name , String password) {
        User user = userDao.selectByName(name,password);
        if(user!= null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    @Override
    public boolean existUser(User user) {
        User user1 = userDao.selectName(user.getUsername());
       if(user1!=null){
           return true;
       }
       return false;
    }
    @Override
   public User selectName(String user){
        return userDao.selectName(user);
    }


    /**
     * 验证登录
     * @param login_name
     * @param login_password
     * @param request
     * @return
     */
    @Override
    public Map<String, Object> loginValid(String login_name, String login_password, HttpServletRequest request){
        User user=userDao.selectByName(login_name, login_password);
        Map<String, Object> map=new HashMap<>();
        if(user==null){
            map.put("status", "userNameOrPwdError");
        }else if(user!=null&&!"".equals(user.getUsername())){
            map.put("status", "ok");
            map.put("user", user);
            request.getSession().setAttribute("user", user);
        }
        return map;
    }


}