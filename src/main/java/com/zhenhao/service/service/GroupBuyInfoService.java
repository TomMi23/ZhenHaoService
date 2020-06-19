package com.zhenhao.service.service;

import com.zhenhao.service.bean.GroupBuyInfoList;
import com.zhenhao.service.mapper.GroupBuyInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "groupBuyInfoList")
@Slf4j
public class GroupBuyInfoService {
    @Autowired
    GroupBuyInfoMapper groupBuyInfoMapper;


    public List<GroupBuyInfoList> findByAllGroupBuyInfoList(){
        return  groupBuyInfoMapper.findByAllGroupBuyInfoList();
    }
}
