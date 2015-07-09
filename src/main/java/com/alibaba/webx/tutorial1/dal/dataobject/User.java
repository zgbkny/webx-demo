package com.alibaba.webx.tutorial1.dal.dataobject;

import static com.alibaba.citrus.util.StringUtil.join;
import static com.alibaba.citrus.util.StringUtil.split;


public class User {
	private String   userId;
    private String   password;
   
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
