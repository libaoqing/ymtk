/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymtk.ai.zhxs.entity.YmtkRole;
import com.ymtk.ai.zhxs.mapper.YmtkRoleMapper;
import com.ymtk.ai.zhxs.query.BaseUserQuery;

/**
 * TODO
 * @since libq @ 2016年4月3日 下午7:52:12
 *
 */
@Service
public class RoleMgrService {
	
	@Autowired
	private YmtkRoleMapper roleMapper;

	/** 
	 * TODO
	 * @param uq
	 * @return
	 * @since libq @ 2016年4月3日 下午9:20:29
	*/
	public List<YmtkRole> queryRoles(BaseUserQuery uq) {
		
		
		return this.roleMapper.select();
	}

}
