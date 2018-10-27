package com.redis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**  
 * @author 陈吉
 * @version 创建时间：2018年10月20日 上午11:19:22
 * Copyright (C) 2018 ChenJi. All rights reserved.
 */

public class JedisPoolTool {
	private static JedisPool pool =null;
	
	static{
		InputStream ins = JedisPoolTool.class.getClassLoader().getResourceAsStream("redis.properties");
		Properties pro = new Properties();
		try{
			pro.load(ins);
		} catch(IOException e){
			e.printStackTrace();
		}
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(Integer.parseInt(pro.get("redis.maxIdle").toString()));
		poolConfig.setMinIdle(Integer.parseInt(pro.get("redis.minIdle").toString()));
		poolConfig.setMaxTotal(Integer.parseInt(pro.get("redis.maxTotal").toString()));
		pool = new JedisPool(poolConfig,pro.getProperty("redis.url") , Integer.parseInt(pro.get("redis.port").toString()));
	}
	
	public static Jedis getJedis(){
		return pool.getResource();
	}
}
