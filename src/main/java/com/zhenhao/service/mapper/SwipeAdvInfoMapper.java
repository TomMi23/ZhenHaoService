package com.zhenhao.service.mapper;

import com.zhenhao.service.bean.SwipeAdvInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface SwipeAdvInfoMapper {

    @Select("select id,name,link,"
            +"url,position,content,enabled,addTime,updateTime,deleted "
            +"from swiper_adv_info where position = #{position}")
    SwipeAdvInfo findByPositionId(@Param("position") String position);

    @Select("select * from swiper_adv_info;")
    List<SwipeAdvInfo> findByAllSwipeAdvInfo();
}
