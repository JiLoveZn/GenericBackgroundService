package com.service;

import com.entity.Users;

/**  
 * @author �¼�
 * @version ����ʱ�䣺2018��10��19�� ����6:00:12
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public interface UsersService {
	
	public Users getUser(Users user);
	public int userRegister(Users user);
	public Users userLogin(Users user);
	public Users userInfo(Users user);
	public int updatePassword(Users user);
	
}
