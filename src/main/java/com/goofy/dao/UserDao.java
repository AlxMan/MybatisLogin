package com.goofy.dao;

import com.goofy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

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
     * @Description: 根据name 和密码查询用户
     * @User wangxianchao
     * @date 2018/6/8 16:30
     */
    User selectByName(@Param("username")String username,
                      @Param("password")String password);
    /*
    　* @Description: 查询全部数据
    　* @user wangxianchao
    　* @date 2018/6/11 18:50 
    */
   List <User> selectAllUser();
   /*
   　* @Description: 根据用户名查询
   　* @user wangxianchao
   　* @date 2018/6/12 17:24
   */
   User selectName(String user);
}