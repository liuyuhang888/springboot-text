package com.offcn.mapper;

import com.offcn.entiry.UserAuths;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @program: springMVC
 * @description:
 * @author: 刘宇航
 * @create: 2020-05-16 13:03
 **/
public interface UserAuthsMapper extends Mapper<UserAuths> {

    List<UserAuths> findByUserId(String userId);
}
