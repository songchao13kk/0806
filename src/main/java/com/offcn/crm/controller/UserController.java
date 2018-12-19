package com.offcn.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.crm.bean.User;
import com.offcn.crm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService  userService;
		@GetMapping("/info")
		
		public String getUserInfo(Map map){
		List<User> list =	userService.getUserInfo();
		map.put("list", list);
			return "list";
		}
		
		
}
