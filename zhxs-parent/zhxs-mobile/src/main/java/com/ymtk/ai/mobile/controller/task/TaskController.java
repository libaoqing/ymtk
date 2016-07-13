package com.ymtk.ai.mobile.controller.task;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.mobile.controller.BaseController;

@Controller
@RequestMapping("/task")
public class TaskController extends BaseController{

	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model){
		System.out.println("wwwwwwwwww");
	//	model.addAttribute("msg", "hello ,libq!");
		return "task/list";
	}
}
