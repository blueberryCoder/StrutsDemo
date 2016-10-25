package com.blueberry.first_struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/10/25.
 */
public class HelloAction extends ActionSupport{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        return "success";
    }
}
