package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.entity.JsonInfo;
import com.entity.Users;

import net.sf.json.JSONObject;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月20日 上午11:18:55
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class UserLoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		JsonInfo jsonInfo = new JsonInfo();
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		if(user != null){
			return true;
		}else{
			jsonInfo.setIsLogin(false);
			JSONObject json = JSONObject.fromObject(jsonInfo);
			response.getWriter().write(json.toString());
			return false;
		}
	}
	
}
