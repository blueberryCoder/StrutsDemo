package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/10/25.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        return SUCCESS;
    }

    public void validate(){
        if("blueberry".equals(username)){
            addActionMessage("You are valid user!");
        }else{
            addActionError("I don't know you,don't try to hack me");
        }
    }
}
