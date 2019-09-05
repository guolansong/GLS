package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bw.mapper.UserMapper;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper um;
	@Override
	public List find() {
		// TODO Auto-generated method stub
		return um.select();
	}

}
