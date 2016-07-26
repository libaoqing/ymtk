package com.ymtk.ai.zhxs.service.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ymtk.ai.zhxs.mapper.YmtkTaskMapper;
import com.ymtk.ai.zhxs.query.TaskQuery;
import com.ymtk.ai.zhxs.result.TaskResult;
import com.ymtk.ai.zhxs.service.BaseService;

@Service
@Transactional
public class TaskService extends BaseService{

	@Autowired
	private YmtkTaskMapper ymtkTaskMapper;

	public List<TaskResult> list(TaskQuery taskQuery) {

		return this.ymtkTaskMapper.list(taskQuery);
	}
	
	
}
