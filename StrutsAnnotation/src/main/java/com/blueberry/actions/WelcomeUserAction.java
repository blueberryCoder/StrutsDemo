package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

/**
 * Created by Administrator on 2016/10/25.
 */
@ParentPackage("struts-default")
@Namespace("/User")
@ResultPath(value = "/")
public class WelcomeUserAction extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Action(value = "Welcome",results = {
            @Result(name = "success",location = "/welcome_user.jsp")
    })
    public String execute(){
        return SUCCESS;
    }
}
