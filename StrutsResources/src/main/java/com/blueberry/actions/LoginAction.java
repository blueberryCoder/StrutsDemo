package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/10/27.
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

    @Override
    public String execute() throws Exception {

        return super.execute();
    }

    @Override
    public void validate() {
        if ("".equals(username)) {
            addFieldError("username", getText("username.required"));
        }

        if ("".equals(password)) {
            addFieldError("password", getText("password.required"));
        }

        if (!"blueberry".equals(username)) {
            addFieldError("username", getText("username.diff"));
        }
    }
}
