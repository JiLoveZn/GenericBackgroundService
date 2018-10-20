package com.entity;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月20日 上午11:15:25
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class JsonInfo {
	
	private String state;
	private String data;
	private String url;
	private boolean isLogin = true;
	
	public JsonInfo(){
		
	}

	public JsonInfo(String state, String data, String url, boolean isLogin) {
		super();
		this.state = state;
		this.data = data;
		this.url = url;
		this.isLogin = isLogin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	@Override
	public String toString() {
		return "JsonInfo [state=" + state + ", data=" + data + ", url=" + url + ", isLogin=" + isLogin + "]";
	}
	
}
