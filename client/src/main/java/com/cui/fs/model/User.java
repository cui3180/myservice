package com.cui.fs.model;


import lombok.Data;

import java.io.Serializable;

/**
 * Created by cjs
 * Date： 2017/7/12.
 * Time： 14:36.
 */
public class User implements Serializable {

    private Long id;
    private String userName;
    private String userAge;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
