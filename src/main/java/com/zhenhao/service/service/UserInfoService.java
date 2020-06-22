package com.zhenhao.service.service;

import com.zhenhao.service.bean.UserInfo;
import com.zhenhao.service.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userMapper;

    public UserInfo findByUsername(String userName){
        return userMapper.findByUsername(userName);
    }
    public UserInfo findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
}
