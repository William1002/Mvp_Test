package com.william.mvp_test.model;

import android.util.SparseArray;

import com.william.mvp_test.bean.UserBean;

/**
 * Created by Administrator on 2016/7/24 0024.
 */
public class UserModel implements IUserModel {
    private String firstName;
    private String lastName;
    private int id;
    private SparseArray<UserBean> mUsererArray = new SparseArray<UserBean>();
    @Override
    public void setID(int id) {
        this.id=id;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName=lastName;
        UserBean UserBean = new UserBean(firstName, lastName);
        mUsererArray.append(id, UserBean);
    }

    @Override
    public UserBean load(int id) {
        this.id = id;
        UserBean userBean = mUsererArray.get(id, new UserBean("not found",
                "not found"));
        return userBean;
    }
}
