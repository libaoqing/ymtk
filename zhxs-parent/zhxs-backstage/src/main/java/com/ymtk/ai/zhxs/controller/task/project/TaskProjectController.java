/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller.task.project;

import java.security.Principal;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.zhxs.controller.BaseController;
import com.ymtk.ai.zhxs.entity.YmtkUser;

/**
 * TODO
 * @since libq @ 2016年4月2日 下午8:26:28
 *
 */
@Controller
@RequestMapping("/task")
public class TaskProjectController extends BaseController{

	@RequestMapping("/task")
	public String task(HttpServletRequest request, Model model){
		Principal user = request.getUserPrincipal();
		System.out.println(user);
	
	//	SecurityUtils.getSubject().getPrincipal()
		/*YmtkUser user = (YmtkUser) SecurityUtils.getSubject().getPrincipal();*/
		request.setAttribute("user_id", "xxxxxxxxxxxx");
		System.out.println(SecurityUtils.getSubject().getPrincipal());
		model.addAttribute("msg", "李保清");
		return "/task/task";
	}
	
	@RequestMapping("/project")
	public String project(HttpServletRequest request, Model model){
		
		model.addAttribute("msg", "李保清");
		return "/task/project";
	}
	
	@RequestMapping("/test")
	public String test(HttpServletRequest request, Model model){
		
		model.addAttribute("msg", "李呃呃呃保清");
		return "/task/test";
	}
}
