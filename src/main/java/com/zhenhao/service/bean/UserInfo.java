package com.zhenhao.service.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 2597547944454691103L;

    private String id;
    private String username;
    private String password;

    public String getUserName() {
        return username; }
    public String getUserPassword() {
        return password;}
    public String getUserID() {
        return id;}

    public void setUserID(String userID){
        this.id=userID;
    }
    public void setUserName(String userName){
        this.username=userName;
    }
    public void setUserPassword(String userPassword){
        this.password=userPassword;
    }


}
