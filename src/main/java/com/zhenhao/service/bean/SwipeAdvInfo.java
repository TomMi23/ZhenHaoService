package com.zhenhao.service.bean;

import java.io.Serializable;

public class SwipeAdvInfo implements Serializable {

    private static final long serialVersionUID = 2597547944454691103L;

    public int id;
    public String name;
    public String link;
    public String url;
    public String position;
    public String content;
    public int enabled;
    public String addTime;
    public String updateTime;
    public int deleted;

    public SwipeAdvInfo(){
    }

    public int getID() {
        return id;
    }
    public String getName() { return name; }
    public String getLink() {
        return link;
    }
    public String getURL() {
        return url;
    }
    public String getPosition() {
        return position;
    }
    public String getContent() {
        return content;
    }
    public int getEnabled() {
        return enabled;
    }
    public String getAddTime() {
        return addTime;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public int getDeleted() {
        return deleted;
    }

//    @Override
//    public String toString() {
//        return "id:"+getID()+" name:"+getName()
//                +" link："+getLink()
//                +" url："+getURL()
//                +" position："+getPosition()
//                +" content："+getContent()
//                +" enabled："+getEnabled()
//                +" addTime："+getAddTime()
//                +" updateTime："+getUpdateTime()
//                +" deleted："+getDeleted();
//    }
}

