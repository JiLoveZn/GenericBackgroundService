package com.entity;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月19日 下午5:53:44
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class Users {
	
	private int id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String phonenumber;
	private int authority;//用户类型
	
	public Users(){
		
	}

	public Users(int id, String name, String username, String password, String email, String phonenumber,
			int authority) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", phonenumber=" + phonenumber + ", authority=" + authority + "]";
	}
	
}
