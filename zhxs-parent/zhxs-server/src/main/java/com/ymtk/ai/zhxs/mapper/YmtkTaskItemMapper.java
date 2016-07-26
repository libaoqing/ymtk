package com.ymtk.ai.zhxs.mapper;

import com.ymtk.ai.zhxs.entity.YmtkTaskItem;

public interface YmtkTaskItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YmtkTaskItem record);

    int insertSelective(YmtkTaskItem record);

    YmtkTaskItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YmtkTaskItem record);

    int updateByPrimaryKey(YmtkTaskItem record);
}