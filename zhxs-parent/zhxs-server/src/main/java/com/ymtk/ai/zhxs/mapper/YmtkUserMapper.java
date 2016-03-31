package com.ymtk.ai.zhxs.mapper;

import com.ymtk.ai.zhxs.entity.YmtkUser;

public interface YmtkUserMapper extends SqlMapper{
    
	int deleteByPrimaryKey(Integer id);

    int insert(YmtkUser record);

    int insertSelective(YmtkUser record);

    YmtkUser select(Integer id);

    int updateByPrimaryKeySelective(YmtkUser record);

    int updateByPrimaryKey(YmtkUser record);

    YmtkUser getUserByName(String loginName);
}