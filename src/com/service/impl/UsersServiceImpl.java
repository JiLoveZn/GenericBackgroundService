package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UsersMapper;
import com.entity.Users;
import com.service.UsersService;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月19日 下午6:01:26
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Users getUser(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.getUser(user);
	}

	@Override
	public int userRegister(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.userRegister(user);
	}

	@Override
	public Users userLogin(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.userLogin(user);
	}

	@Override
	public Users userInfo(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.userInfo(user);
	}

	@Override
	public int updatePassword(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.updatePassword(user);
	}
	
}
