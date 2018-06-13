package com.goofy.controller;

import com.goofy.entity.User;
import com.goofy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Description TODO
 * @Author wangxianchao
 * @Date 2018/6/8 11:32
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {
    @Autowired
    private UserService userService;
    /*
    　* @Description: 注册页面
    　* @user wangxianchao
    　* @date 2018/6/12 14:58 
    */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return  "register";
    }
    @RequestMapping("/register")
    public String register(Model model, User user, BindingResult bindingResult){
        if (userService.existUser(user)){
            bindingResult.rejectValue("username", "userExist", "用户名已存在");
        }else {
            userService.insertUser(user);
            return "success";
        }
        return "fail";
    }


    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user,Model model){
        //调用service方法
        user = userService.selectByName(user.getUsername(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherpage")
    public String hrefpage(){

        return "anotherpage";
    }

    //注销方法
    @RequestMapping("/index")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "index";
    }
    
}