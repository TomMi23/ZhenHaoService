package com.zhenhao.service.mapper;

import com.zhenhao.service.bean.UserInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserInfoMapper {
    @Select("SELECT id,username,password FROM user WHERE username=#{username}")
    UserInfo findByUsername(@Param("username") String username);

    @Select("SELECT username,password FROM user WHERE id=#{id}")
    UserInfo findUserById(String id);
}
