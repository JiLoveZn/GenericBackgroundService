package com.service;

import com.entity.Users;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月19日 下午6:00:12
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public interface UsersService {
	
	public Users getUser(Users user);
	public int userRegister(Users user);
	public Users userLogin(Users user);
	public Users userInfo(Users user);
	public int updatePassword(Users user);
	
}
