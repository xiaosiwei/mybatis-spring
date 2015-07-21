package com.meituan.xiaosiwei.MSTest.service;

import com.meituan.xiaosiwei.MSTest.UserMapper.UserMapper;
import com.meituan.xiaosiwei.MSTest.domain.LoginMessage;
import com.meituan.xiaosiwei.MSTest.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaosiwei on 15/7/20.
 */
@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int createUser(UserDO userDO){
        return userMapper.createUser(userDO);
    }

    public UserDO getUser(LoginMessage loginMessage){
        return userMapper.getUser(loginMessage);
    }
}
