package com.goofy.testCase;

import com.goofy.service.impl.UserServicImpl;

public class TestCase {
    public static void main(String args[]){
        UserServicImpl rs =new UserServicImpl();
        //用户注册
//        rs.register("赵四","123456");
        // 用户登陆
//        rs.login("liudehua","liudehua");
        //修改密码
//        rs.updateUser("liudehua","44444");
        //用户注销
//        rs.deleteUser("liudehua","liudehua");
        //查询所有用户
        rs.allNume();
    }
}
