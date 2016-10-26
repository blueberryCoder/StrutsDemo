package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/10/26.
 */
public class LongProcessAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
       for(int i=0;i<100000;i++){
           System.out.println(i);
       }
        return SUCCESS;
    }
}
