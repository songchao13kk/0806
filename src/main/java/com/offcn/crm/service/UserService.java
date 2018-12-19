package com.offcn.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.offcn.crm.bean.User;
import com.offcn.crm.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Transactional(readOnly=true)
	public List<User> getUserInfo() {
	
		return userMapper.getUserInfo();
	}
	
}
