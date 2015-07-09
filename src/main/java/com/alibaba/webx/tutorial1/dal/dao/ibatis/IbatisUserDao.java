package com.alibaba.webx.tutorial1.dal.dao.ibatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alibaba.webx.tutorial1.dal.dao.UserDao;
import com.alibaba.webx.tutorial1.dal.dataobject.User;
import com.alibaba.webx.tutorial1.user.module.screen.Login;

public class IbatisUserDao extends SqlMapClientDaoSupport implements UserDao {
	private static final Logger logger = LoggerFactory.getLogger(IbatisUserDao.class);
	public User getUserById (String userId) {
		// TODO Auto-generated method stub
		logger.info("ibatisUserDao getUser");
		return (User) getSqlMapClientTemplate().queryForObject("getUserByUserId", userId);
	}
}
