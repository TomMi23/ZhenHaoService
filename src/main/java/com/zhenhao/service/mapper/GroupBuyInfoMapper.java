package com.zhenhao.service.mapper;

import com.zhenhao.service.bean.GroupBuyInfoList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GroupBuyInfoMapper {

    @Select("select gid as id,name,brief,picUrl,counterPrice,retailPrice,grouponPrice,grouponDiscount,grouponMember from group_buy_info;")
    List<GroupBuyInfoList> findByAllGroupBuyInfoList();
}

