package com.ymtk.ai.zhxs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.mapper.YmtkUserMapper;

@Service
public class TestService {
	
	@Autowired
	private YmtkUserMapper ymtkUserMapper;

	public void query() {
		YmtkUser list = this.ymtkUserMapper.select(1);
		
	}

	
	
}
