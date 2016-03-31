package com.ymtk.ai.zhxs.mapper;

import java.util.List;

import com.ymtk.ai.zhxs.entity.YmtkRole;

public interface YmtkRoleMapper extends SqlMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(YmtkRole record);

    int insertSelective(YmtkRole record);

    YmtkRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YmtkRole record);

    int updateByPrimaryKey(YmtkRole record);
    
    List<YmtkRole> select();
}