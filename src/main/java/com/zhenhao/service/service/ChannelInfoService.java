package com.zhenhao.service.service;

import com.zhenhao.service.bean.ChannelInfo;
import com.zhenhao.service.mapper.ChannelInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "channelInfo")
@Slf4j
public class ChannelInfoService {
    @Autowired
    ChannelInfoMapper channelInfoMapper;


    public List<ChannelInfo> findByAllChannelInfo(){
        return  channelInfoMapper.findByAllChannelInfo();
    }
}

