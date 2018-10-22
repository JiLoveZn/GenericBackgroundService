package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.UsersService;

/**  
 * @author ³Â¼ª
 * @version ´´½¨Ê±¼ä£º2018Äê10ÔÂ20ÈÕ ÉÏÎç11:13:25
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class UsersController {

	@Autowired
	private UsersService usersService;
	@RequestMapping(value="/register.action",method=RequestMethod.POST)；
	
}
