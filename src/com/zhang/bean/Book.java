package com.zhang.bean;

/**
 * Created by ZhangLei on 2017/5/22.
 */
public class Book {
    private String name;
    private String auther;
    private String time;

    public Book(String name, String auther, String time) {
        this.name = name;
        this.auther = auther;
        this.time = time;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
