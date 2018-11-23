package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RedisService;

import redis.clients.jedis.Jedis;

@RestController
public class RedisController {
	@Autowired
	private RedisService redisService;
	 /**
	  * 向redis存储值
     */
    @RequestMapping("/set")  
    public String set(String key, String value) throws Exception{
        redisService.set(key, value);
        return "success";  
    }  
    
    /**
      * 获取redis中的值
     */
    @RequestMapping("/get")  
    public String get(String key){  
        try {
			return redisService.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";  
    }  
    public static void main(String[] args) {
    	 //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
	}
}
