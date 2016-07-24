package com.william.mvp_test.model;

import com.william.mvp_test.bean.UserBean;

/**
 * Created by Administrator on 2016/7/24 0024.
 */
public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    UserBean load(int id);
}
