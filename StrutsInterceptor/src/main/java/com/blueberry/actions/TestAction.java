package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.LoggingInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Administrator on 2016/10/26.
 */
public class TestAction extends ActionSupport{
    public TestAction(){
       Logger LOG = LogManager.getLogger(LoggingInterceptor.class);

    }
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
