package com.goofy;

import com.goofy.dao.UserDao;
import com.goofy.entity.User;
import net.sf.ehcache.transaction.xa.EhcacheXAException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/6/11 18:18
 * @Version 1.0
 */
public class TestUserDao extends TestMybatis{
    @Autowired
    private UserDao userDao;

    @Test
    public void add(){
        User user =new User();
        user.setUsername("wangxianchao");
        user.setPassword("123456");
        user.setAge("29");
        user.setSex("男");
        user.setEmail("123@134.cn");
        user.setPhone(123456);
        userDao.insertUser(user);

    }
    /*
    　* @Description: deleteUser
    　* @user wangxianchao
    　* @date 2018/6/12 14:02
    */
    @Test
    public void deleteUser(){
        User user = new User();
        user.setUsername("liudehua");
        userDao.deleteUser(user);
    }

    /*
    　* @Description: 查询所有数据
    　* @user wangxianchao
    　* @date 2018/6/11 20:41
    */
    @Test
    public void selectAllUser(){
    List<User> user = userDao.selectAllUser();
        for (User s:user) {
            System.out.println(s);
        }
    }
    /*
    　* @Description: 查询单条数据
    　* @user wangxianchao
    　* @date 2018/6/11 20:42
    */
    @Test
    public void selectByname(){
        User user= userDao.selectByName("zhangxueyou","123456");
        System.out.println(user);
    }
    /*
    　* @Description: updateUser
    　* @user wangxianchao
    　* @date 2018/6/12 13:51
    */
    @Test
    public void updateUser() {
        User user = new User();
        user.setUsername("liudehua");
        user.setPassword("888888");
        userDao.updatUser(user);
    }
}