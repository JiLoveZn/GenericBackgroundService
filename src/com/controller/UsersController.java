package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.UsersService;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月20日 上午11:13:25
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class UsersController {

	@Autowired
	private UsersService usersService;
	@RequestMapping(value="/register.action",method=RequestMethod.POST)
}
