package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

/**
 * Created by Administrator on 2016/10/25.
 */
@ParentPackage("struts-default")
@Namespace("/")
@ResultPath(value = "/")
@Result(name = "success",location = "login.jsp")
public class LoginAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("LoginAction......execute");
        return super.execute();
    }
}
