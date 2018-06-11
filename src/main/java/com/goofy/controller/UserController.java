package com.goofy.controller;

import com.goofy.entity.User;
import com.goofy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class UserController {
    @Autowired
    private UserService userService;

    /*
    　* @Description: 用户登陆
    　* @user wangxianchao
    　* @date 2018/6/8 17:13
    */
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        User resultUser = userService.selectByName(user);
        if (resultUser == null) {
            System.out.println("null");
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "用户名或密码错误！");
            return "index";
        } else {
            System.out.println("not null");
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/success.jsp";
        }
    }

}