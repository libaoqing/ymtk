package com.ymtk.ai.zhxs.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.mapper.YmtkUserMapper;

public class UserManager {
	
	@Autowired
	private YmtkUserMapper userMapper;

	public YmtkUser getUserByName(String loginName) {
	
		return this.userMapper.getUserByName(loginName);
	}

}
