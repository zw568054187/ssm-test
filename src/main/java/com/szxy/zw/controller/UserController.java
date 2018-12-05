package com.szxy.zw.controller;

import com.szxy.zw.pojo.User;
import com.szxy.zw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/2 9:22
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("users")
    public String toUser(Model model){
        List<User> users = userService.queryUserList();
        model.addAttribute("users",users);
        System.out.println(users);
        return "users";
    }
}
