package com.offcn.mapper;

import com.offcn.entiry.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    List<User> findAll();

    User findById(String id);
}