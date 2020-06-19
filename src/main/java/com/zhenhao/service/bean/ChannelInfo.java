package com.zhenhao.service.bean;

import java.io.Serializable;

public class ChannelInfo implements Serializable {

    private static final long serialVersionUID = 2597547944454691103L;

    public String name;
    public String channelID;
    public String iconUrl;

    public ChannelInfo(){
    }

    public String getName() { return name; }
    public String getChannelID() {
        return channelID;
    }
    public String getIconUrl() {
        return iconUrl;
    }


    @Override
    public String toString() {
        return "id:"+getChannelID()+" name:"+getName()
                +" iconUrl："+getIconUrl();
    }
}

