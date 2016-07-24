package com.william.mvp_test.bean;

/**
 * Created by Administrator on 2016/7/24 0024.
 */
public class UserBean {
    private String firstName;
    private String lastName;

    public UserBean(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
