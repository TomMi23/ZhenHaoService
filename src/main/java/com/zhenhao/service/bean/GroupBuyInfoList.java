package com.zhenhao.service.bean;

import java.io.Serializable;

public class GroupBuyInfoList implements Serializable {

    private static final long serialVersionUID = 2597547944454691103L;

    public String id;
    public String name;
    public String brief;
    public String picUrl;
    public double counterPrice;
    public double retailPrice;
    public double grouponPrice;
    public int grouponDiscount;
    public int grouponMember;

    public GroupBuyInfoList(){
    }

    public String getID() { return id; }
    public String getName() { return name; }
    public String getBrief() {
        return brief;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public double getCounterPrice() {
        return counterPrice;
    }
    public double getRetailPrice() {
        return retailPrice;
    }
    public double getGrouponPrice() {
        return grouponPrice;
    }
    public int getGrouponDiscount() {
        return grouponDiscount;
    }
    public int getGrouponMember() {
        return grouponMember;
    }

    @Override
    public String toString() {
        return "id:"+getID()+" name:"+getName()
                +" brief："+getBrief()+" picUrl:"+getPicUrl()+" counterPrice:"+getCounterPrice()
                +" retailPrice："+getRetailPrice()+" grouponPrice:"+getGrouponPrice()+" grouponDiscount:"+getGrouponDiscount()
                +" grouponMember："+getGrouponMember();
    }
}


