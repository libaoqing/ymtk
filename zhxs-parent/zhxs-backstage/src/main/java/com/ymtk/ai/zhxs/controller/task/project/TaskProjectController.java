/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller.task.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.zhxs.controller.BaseController;

/**
 * TODO
 * @since libq @ 2016年4月2日 下午8:26:28
 *
 */
@Controller
@RequestMapping("/task")
public class TaskProjectController extends BaseController{

	@RequestMapping("/project")
	public String project(HttpServletRequest request, Model model){
		
		
		return "/task/index";
	}
}
