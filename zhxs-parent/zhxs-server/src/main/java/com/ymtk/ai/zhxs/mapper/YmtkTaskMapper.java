package com.ymtk.ai.zhxs.mapper;

import java.util.List;

import com.ymtk.ai.zhxs.entity.YmtkTask;
import com.ymtk.ai.zhxs.query.TaskQuery;
import com.ymtk.ai.zhxs.result.TaskResult;


public interface YmtkTaskMapper extends SqlMapper{
	
    int delete(Integer id);

    int insert(YmtkTask record);

    YmtkTask get(Integer id);

    int updateByPrimaryKey(YmtkTask record);

	List<TaskResult> list(TaskQuery taskQuery);
}