package com.zhang.bean;

/**
 * Created by ZhangLei on 2017/5/22.
 */
public class configronments {

    private String id;
    private String type;
    private String name;
    private String value;
    private String resource;

    public configronments(String id, String type, String name, String value, String resource) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.value = value;
        this.resource = resource;
    }

    public configronments() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
