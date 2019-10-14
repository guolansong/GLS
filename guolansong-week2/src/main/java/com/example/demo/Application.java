package com.example.demo;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwie.bean.Goods;

@SpringBootApplication
@Controller
public class Application {

	@Resource 
	private RedisAccessor RedisAccessor;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("list")
	public String list() {
		Goods goods = new Goods();
//		   添加
		   goods.setId(1);
		   goods.setName("微星GP75轻薄17英寸游戏本");
		   goods.setPrice(8999);
		   goods.setBfb("20%");
//		   保存到redis
//		   RedisAccsessor.range;
		return "list";
	}

}
