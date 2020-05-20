package com.offcn.service;


import com.offcn.entiry.User;

import java.util.List;

/**
 * @program: springMVC
 * @description:
 * @author: 刘宇航
 * @create: 2020-05-16 11:56
 **/
public interface UserService {

    List<User> findUserList();

    User findUserById(String id);

    Integer insetUser(User user);

    Integer updateUser(User id);

    Integer deleteUser(String id);

}
