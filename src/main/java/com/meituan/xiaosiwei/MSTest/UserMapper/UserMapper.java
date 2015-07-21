package com.meituan.xiaosiwei.MSTest.UserMapper;

import com.meituan.xiaosiwei.MSTest.domain.LoginMessage;
import com.meituan.xiaosiwei.MSTest.domain.UserDO;
import org.apache.ibatis.annotations.*;

/**
 * Created by xiaosiwei on 15/7/20.
 */
public interface UserMapper {
    @Insert("insert into t_user(user_name,password,real_name,storage) values(#{userName},#{password},#{realName},#{storage})")
    @Options(useGeneratedKeys = true,keyProperty = "userID",keyColumn = "user_id")
    int createUser(UserDO userDO);

    //注意这里是#{userName}而不是${userName}，后者是html内的写法。
    @Select("Select * from t_user where user_name=#{userName} and password=#{password}")
    @Results({
            @Result(column = "user_id",property = "userID"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "password",property = "password"),
            @Result(column = "real_name",property = "realName"),
            @Result(column = "storage",property = "storage")
    })
    UserDO getUser(LoginMessage loginMessage);

}
