package com.ymtk.ai.mobile.controller.task;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.mobile.controller.BaseController;
import com.ymtk.ai.zhxs.query.TaskQuery;
import com.ymtk.ai.zhxs.result.TaskResult;
import com.ymtk.ai.zhxs.service.task.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController extends BaseController{
	
	@Autowired
	private TaskService taskService;

	@RequestMapping("/list")
	public String list(TaskQuery taskQuery,HttpServletRequest request, Model model){
	
		
		List<TaskResult> list = this.taskService.list(taskQuery);
		
		
		return "/task/list";
	}
	
	
}
