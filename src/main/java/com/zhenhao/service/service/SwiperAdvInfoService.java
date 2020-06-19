package com.zhenhao.service.service;

import com.zhenhao.service.bean.SwipeAdvInfo;
import com.zhenhao.service.mapper.SwipeAdvInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "swipeAdvInfo")
@Slf4j
public class SwiperAdvInfoService {
    @Autowired
    SwipeAdvInfoMapper swipeAdvInfoMapper;

    /**
     * @param position
     * @return
     * */
    @Cacheable(key = "#position",unless = "#result == null")
    public SwipeAdvInfo findByPositionId(String position){
        return swipeAdvInfoMapper.findByPositionId(position);
    }

    public List<SwipeAdvInfo> findByAllSwipeAdvInfo(){
        return  swipeAdvInfoMapper.findByAllSwipeAdvInfo();
    }
}

