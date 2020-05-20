package com.offcn.service.impl;

import com.offcn.entiry.User;
import com.offcn.mapper.UserMapper;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springMVC
 * @description:
 * @author: 刘宇航
 * @create: 2020-05-16 13:11
 **/

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserList() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(String id) {
        return userMapper.findById(id);
    }

    @Override
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    public Integer insetUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    public Integer updateUser(User user) {

        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    public Integer deleteUser(String id) {

        return userMapper.deleteByPrimaryKey(id);
    }

}
