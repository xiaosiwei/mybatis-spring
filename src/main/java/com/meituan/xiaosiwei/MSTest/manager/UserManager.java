package com.meituan.xiaosiwei.MSTest.manager;

import com.meituan.xiaosiwei.MSTest.UserMapper.UserMapper;
import com.meituan.xiaosiwei.MSTest.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiaosiwei on 15/7/20.
 */
@Component("userManager")
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    public UserDO getUserDO(int id){
        return userMapper.getUserByID(id);
    }
}
