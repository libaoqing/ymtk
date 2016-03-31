package com.ymtk.ai.zhxs.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ymtk.ai.zhxs.entity.YmtkPermission;
import com.ymtk.ai.zhxs.entity.YmtkRole;
import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.mapper.YmtkPermissionMapper;
import com.ymtk.ai.zhxs.mapper.YmtkRoleMapper;

public class PermissionManager {
	
	@Autowired
	private YmtkPermissionMapper permissionMapper;
	@Autowired
	private YmtkRoleMapper roleMapper;

	public List<YmtkPermission> getPermission(YmtkUser user) {		
		
		return this.permissionMapper.queryPermissions();
	}

	public List<YmtkRole> getRoles(YmtkUser user) {
		
		return this.roleMapper.select();
	}

}
