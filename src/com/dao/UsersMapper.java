package com.dao;

import com.entity.Users;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月20日 上午11:10:48
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public interface UsersMapper {
	
	Users getUser(Users user);
	int userRegister(Users user);
	Users userLogin(Users user);
	Users userInfo(Users user);
	int updatePassword(Users user);
	
}
