package com.xz.bean;

/**
 * @author xz
 * @date 2019/12/18 9:47
 **/


public class Student {
    private String name;
    private String grade;

    private Friend friend;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }
}
