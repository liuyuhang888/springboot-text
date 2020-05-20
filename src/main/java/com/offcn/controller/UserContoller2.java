package com.offcn.controller;

import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: springboot-text
 * @description:
 * @author: 刘宇航
 * @create: 2020-05-19 21:00
 **/
@Controller
@RequestMapping("/user2")
public class UserContoller2 {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getUserList(Model model){
        model.addAttribute(service.findUserList());
        return "userlist";
    }
}
