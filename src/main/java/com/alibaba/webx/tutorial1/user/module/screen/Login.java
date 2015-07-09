package com.alibaba.webx.tutorial1.user.module.screen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Param;
import com.alibaba.webx.tutorial1.biz.UserManager;

public class Login {
	@Autowired
    private UserManager userManager;
	
	private static final Logger logger = LoggerFactory.getLogger(Login.class);
	
	public void execute(@Param("name") String name, Context context) {
		logger.info("hello here");
		userManager.getUser("");
		logger.info("？");
        context.put("name", name);
    }
}
