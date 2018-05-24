package com.goofy.service.impl;

import com.goofy.entity.UserEntity;
import com.goofy.factory.Factory;
import com.goofy.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class UserServicImpl {
    /*
    用户登陆
     */
    public void login(String username,String password){
        SqlSession session = Factory.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        try{
            List<UserEntity> list = new ArrayList<UserEntity>();
            list =  mapper.selectUserByName(userEntity);
            for (int i=0;i<list.size();i++){
                if (list.size()==1&&list.get(i).getUsername().equals(username)&&list.get(i).getPassword().equals(password)){
                    System.out.println(list.get(i));
                    System.out.print("成功！");
                }else {
                    System.out.print("失败！");
                }
            }
        }catch(Exception e){
            e.printStackTrace();}

    }
    /*
    用户注册
     */
    public void register(String username,String password){
        SqlSession session = Factory.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        try{
            mapper.insertUser(userEntity);
            session.commit();
            login(username,password);
        }catch(Exception e){
            e.printStackTrace();}

    }
    /*
   修改密码
   */
    public void updateUser(String username,String password){
        SqlSession session = Factory.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        try{
            mapper.updateUser(userEntity);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
    用户注销
    */
    public void deleteUser(String username,String password){
        SqlSession session = Factory.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        try{
             mapper.deleteUser(userEntity);
             session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /*
    查询所有用户
     */
    public void allNume(){
        SqlSession session = Factory.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try{
            List<UserEntity> list = new ArrayList<UserEntity>();
            list = (List<UserEntity>) mapper.selectAllUser();
            for (int i=0;i<list.size();i++){
                    System.out.println(list.get(i));
            }
//            session.commit();
        }catch(Exception e){
            e.printStackTrace();}

    }

}


