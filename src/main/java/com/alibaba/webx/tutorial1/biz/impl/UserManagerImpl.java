package com.alibaba.webx.tutorial1.biz.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.webx.tutorial1.biz.UserManager;
import com.alibaba.webx.tutorial1.dal.dao.UserDao;
import com.alibaba.webx.tutorial1.dal.dataobject.User;
import com.alibaba.webx.tutorial1.user.module.screen.Login;

public class UserManagerImpl implements UserManager {
	@Autowired
    private UserDao userDao;
	
	private static final Logger logger = LoggerFactory.getLogger(UserManagerImpl.class);
	public User login(String userId, String password) {
		// TODO Auto-generated method stub
		logger.info("UserManagerImpl login ");
		return null;
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	public User getUser(String userId) {
		// TODO Auto-generated method stub
		logger.info("UserManagerImpl getUser");
		User user = userDao.getUserById("we");
		if (user != null) {
			logger.info("user:" + user.getPassword());
		}
		return null;
	}

}
