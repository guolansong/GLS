package com.example.demo;

import java.io.BufferedReader;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.test.context.junit4.SpringRunner;

import com.bwie.bean.Goods;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Resource 
	private RedisAccessor RedisAccessor;
	
	@Test
	public void contextLoads() {
	}
	
//	连接到列表页面
	@Test
	public String add() {
	   Goods goods = new Goods();
//	   添加
	   goods.setId(1);
	   goods.setName("微星GP75轻薄17英寸游戏本");
	   goods.setPrice(8999);
	   goods.setBfb("20%");
//	   连接到列表页面
	   return "list";
	}
	
	@Test
	public void jx() {
//		连接
		ClassPathXmlApplicationContext path = new ClassPathXmlApplicationContext("application.properties");
//		解析文件
//		BufferedReader reader = new BufferedReader("text");
		
	}

}
