/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.mapper.YmtkUserMapper;
import com.ymtk.ai.zhxs.query.BaseUserQuery;

/**
 * TODO
 * @since libq @ 2016年4月3日 下午7:52:12
 *
 */
@Service
public class UserMgrService {
	
	@Autowired
	private YmtkUserMapper userMapper;

	/** 
	 * TODO
	 * @param uq
	 * @return
	 * @since libq @ 2016年4月3日 下午7:53:24
	*/
	public List<YmtkUser> queryUsers(BaseUserQuery uq) {
		
		return this.userMapper.queryUsers(uq);
	}

}
