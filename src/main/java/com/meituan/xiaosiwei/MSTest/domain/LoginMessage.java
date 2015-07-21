package com.meituan.xiaosiwei.MSTest.domain;

/**
 * Created by xiaosiwei on 15/7/21.
 */
public class LoginMessage {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
