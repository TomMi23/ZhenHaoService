package com.zhenhao.service.bean;

import java.io.Serializable;
import java.util.List;

public class HomeInfoList implements Serializable {

    private static final long serialVersionUID = 2597547944454691103L;

    //    public List<HomeInfo> homeInfoList;
    public List<SwipeAdvInfo> swipeAdvInfoList;
    public List<ChannelInfo> channelInfoList;
    public List<GroupBuyInfoList> groupBuyInfoList;

    public HomeInfoList(){
    }

    //    public List<HomeInfo> getHomeInfoList() {
//        return homeInfoList;
//    }
    public List<SwipeAdvInfo> getSwipeAdvInfoList(){return  swipeAdvInfoList;}
    public List<ChannelInfo> getChannelInfoList(){return  channelInfoList;}
    public List<GroupBuyInfoList> getGroupBuyInfoList(){return  groupBuyInfoList;}

    @Override
    public String toString() {
        return "我是toSting";
    }


}

