package com.meituan.xiaosiwei.MSTest.UserMapper;

import com.meituan.xiaosiwei.MSTest.domain.UserDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xiaosiwei on 15/7/20.
 */
public interface UserMapper {
    @Select("select * from t_user where user_id=#{id}")
    UserDO getUserByID(@Param("id") int id);

    @Select("select * from t_user where user_name=#{name}")
    UserDO getUserByName(@Param("name") String name);
}
