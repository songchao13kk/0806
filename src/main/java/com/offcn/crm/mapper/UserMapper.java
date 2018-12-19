package com.offcn.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.offcn.crm.bean.User;

public interface UserMapper {

	List<User> getUserInfo();

}
