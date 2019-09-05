package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping("list.do")
	public String list(Model model) {
		List list = us.find();
		model.addAttribute("list", list);
		return "list";
	}
}
