package com.dao;

import com.entity.Users;

/**  
 * @author �¼�
 * @version ����ʱ�䣺2018��10��20�� ����11:10:48
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public interface UsersMapper {
	
	Users getUser(Users user);
	int userRegister(Users user);
	Users userLogin(Users user);
	Users userInfo(Users user);
	int updatePassword(Users user);
	
}
