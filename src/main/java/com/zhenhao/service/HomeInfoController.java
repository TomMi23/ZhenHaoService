package com.zhenhao.service;

import com.zhenhao.service.bean.*;
import com.zhenhao.service.enums.ErrorCodeAndMsg;
import com.zhenhao.service.exception.HomeInfoListException;
import com.zhenhao.service.response.Response;
import com.zhenhao.service.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeInfoController {

    @Autowired
    SwiperAdvInfoService swiperAdvInfoService;
    @Autowired
    ChannelInfoService channelInfoService;
    @Autowired
    GroupBuyInfoService groupBuyInfoService;

//    @RequestMapping("/index")//这是GET方式
//    //@PostMapping("/index")
//    public Response findByHomeId(@RequestParam("homeId") String homeId){
//        try{
//
//            if(homeId == null){
//                throw new HomeInfoListException(ErrorCodeAndMsg.Student_number_is_empty);
//            }
//
//            HomeInfo homeInfo = homeInfoService.findByHomeId(homeId);
//            if(homeId == null){
//                throw new HomeInfoListException(ErrorCodeAndMsg.Student_number_does_not_exist);
//            }
//            return new Response(homeInfo);
//        }catch (Exception e){
//            if(e instanceof HomeInfoListException){
//                throw e;
//            }else {
//                //log.error("findByStudentId error:",e);
//                throw new HomeInfoListException(ErrorCodeAndMsg.Network_error);
//            }
//        }
//    }

    @RequestMapping("/indexall.do")//这是GET方式
    //@PostMapping("/indexall.do")
    public Response findByAllHomeInfo(){
        try{
            List<SwipeAdvInfo> swipeAdvInfoList = swiperAdvInfoService.findByAllSwipeAdvInfo();
            List<ChannelInfo> channelInfoList =channelInfoService.findByAllChannelInfo();
            List<GroupBuyInfoList> groupBuyInfoLists = groupBuyInfoService.findByAllGroupBuyInfoList();

            HomeInfoList homeInfoList=new HomeInfoList();
            homeInfoList.swipeAdvInfoList=swipeAdvInfoList;
            homeInfoList.channelInfoList=channelInfoList;
            homeInfoList.groupBuyInfoList=groupBuyInfoLists;


            return new Response(homeInfoList);
        }catch (Exception e){
            if(e instanceof HomeInfoListException){
                throw e;
            }else {
                //log.error("findByStudentId error:",e);
                throw new HomeInfoListException(ErrorCodeAndMsg.Network_error);
            }
        }
    }
}

