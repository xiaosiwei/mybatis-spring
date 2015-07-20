package com.meituan.xiaosiwei.MSTest.domain;

/**
 * Created by xiaosiwei on 15/7/18.
 */
public class UserDO {

    private int user_id;
    private String user_name;
    private int score;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
