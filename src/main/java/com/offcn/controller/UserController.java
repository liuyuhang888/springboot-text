package com.offcn.controller;

import com.offcn.entiry.User;
import com.offcn.service.UserService;
import com.offcn.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springMVC
 * @description:
 * @author: 刘宇航
 * @create: 2020-05-15 16:12
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResultVo userList() {
        return ResultVo.success(userService.findUserList(), "查询成功");
    }

    @GetMapping("/{id}")
    public ResultVo findUserById(@PathVariable("id") String id) {
        return ResultVo.success(userService.findUserById(id), "查询成功");
    }

    @PostMapping
    public ResultVo insertUser(@RequestBody(required = true) User user) {

        return ResultVo.success(userService.insetUser(user), "插入成功");
    }

    @PutMapping
    public ResultVo updateUser(User user) {

        return ResultVo.success(userService.updateUser(user), "修改成功");
    }

    @DeleteMapping("/{id}")
    public ResultVo deleteUser(@PathVariable String id) {
        return ResultVo.success(userService.deleteUser(id), "删除成功");
    }

}
