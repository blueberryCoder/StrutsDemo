package com.blueberry.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2016/10/26.
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public Customer getModel() {
        return customer;
    }
}
