package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.JsonInfo;
import com.entity.Users;
import com.service.UsersService;

import net.sf.json.JSONObject;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月20日 上午11:13:25
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/register.action",method=RequestMethod.POST)
	public @ResponseBody JsonInfo 
	register(Users user,HttpServletResponse response)throws IOException{
		JsonInfo jsonInfo = new JsonInfo();
		Users users = usersService.getUser(user);
		if(users != null){
			jsonInfo.setState("2");
		}else{
			int result = usersService.userRegister(user);
			if(result > 0){
				jsonInfo.setState("1");
			}else{
				jsonInfo.setState("0");
			}
		}
		return jsonInfo;
	}
	
	@RequestMapping(value="/userLogin.action",method=RequestMethod.POST)
	public @ResponseBody JsonInfo 
	login(@RequestBody Users user,HttpServletRequest request) throws IOException{
		JsonInfo jsonInfo = new JsonInfo();
		Users users = usersService.userLogin(user);
		if(users != null){
			HttpSession session = request.getSession();
			session.setAttribute("user", users);
			jsonInfo.setState("1");
		}else{
			jsonInfo.setState("0");
		}
		return jsonInfo;
	}
	
	@RequestMapping(value="/userInfo.action",method=RequestMethod.POST)
	public @ResponseBody JsonInfo 
	userinfo(HttpServletRequest request) throws IOException{
		JsonInfo jsonInfo = new JsonInfo();
		HttpSession session =request.getSession();
		Users users = (Users)session.getAttribute("user");
		if(users == null){
			jsonInfo.setState("0");
			return jsonInfo;
		}else{
			JSONObject usersJson = JSONObject.fromObject(users);
			jsonInfo.setState("1");
			jsonInfo.setData(usersJson.toString());
			return jsonInfo;
		}
	}
	
	@RequestMapping(value="/updateInfo.action",method=RequestMethod.POST)
	public @ResponseBody JsonInfo 
	updateInfo(HttpServletRequest request,String oldPassword,String newPassword) throws IOException{
		JsonInfo jsonInfo = new JsonInfo();
		HttpSession session =request.getSession();
		Users users = (Users)session.getAttribute("user");
		if(users == null){
			jsonInfo.setState("0");
			return jsonInfo;
		}else if(!oldPassword.equals(users.getPassword())){
			jsonInfo.setState("1");
			return jsonInfo;
		}else{
			Users user = new Users();
			user.setUsername(users.getUsername());
			user.setPassword(newPassword);
			int result = usersService.updatePassword(user);
			if(result > 0){
				users.setPassword(newPassword);
				session.setAttribute("user", users);
				jsonInfo.setState("3");
				return jsonInfo;
			}else{
				jsonInfo.setState("2");
				return jsonInfo;
			}
		}
	}
	
}
