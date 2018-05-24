package com.goofy.mapper;

import com.goofy.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    /**
     * 新增用戶
     */
    public int insertUser(UserEntity user) throws Exception;
    /**
     * 修改用戶
     */
    public int  updateUser (UserEntity user) throws Exception;
    /**
     * 刪除用戶
     */
    public int deleteUser(UserEntity user) throws Exception;
    /**
     * 根据Name,pass查询用户信息
     */
    public List<UserEntity> selectUserByName(UserEntity user) throws Exception;
    /**
     * 查询所有的用户信息
     */
    public List<UserEntity> selectAllUser() throws Exception;
}