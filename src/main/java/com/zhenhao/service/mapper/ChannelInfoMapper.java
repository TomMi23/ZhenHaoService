package com.zhenhao.service.mapper;

import com.zhenhao.service.bean.ChannelInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChannelInfoMapper {

    @Select("select * from channel_info;")
    List<ChannelInfo> findByAllChannelInfo();
}
