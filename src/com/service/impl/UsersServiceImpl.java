package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.UsersMapper;
import com.entity.Users;
import com.service.UsersService;

/**  
 * @author �¼�
 * @version ����ʱ�䣺2018��10��19�� ����6:01:26
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
