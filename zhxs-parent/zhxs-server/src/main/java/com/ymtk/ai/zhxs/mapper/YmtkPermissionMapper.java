package com.ymtk.ai.zhxs.mapper;

import java.util.Collection;
import java.util.List;

import com.ymtk.ai.zhxs.entity.YmtkPermission;
import com.ymtk.ai.zhxs.security.pojo.Permission;
import com.ymtk.ai.zhxs.security.pojo.User;

public interface YmtkPermissionMapper extends SqlMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(YmtkPermission record);

    int insertSelective(YmtkPermission record);

    YmtkPermission selectByPrimaryKey(Integer id);



    int updateByPrimaryKey(YmtkPermission record);

	Collection<Permission> getPermission(User user);

	List<YmtkPermission> queryPermissions();
}