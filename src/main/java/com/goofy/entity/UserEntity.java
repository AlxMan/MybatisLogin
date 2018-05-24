package com.goofy.entity;

public class UserEntity {
    private int id;
    private String username;
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //定义无参构造方法
    public UserEntity(){
        super();
    }
    public String toString(){
        return "userid=:"+id+",username:"+this.username+",password:"+this.password;
    }
}
