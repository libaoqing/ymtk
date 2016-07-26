package com.ymtk.ai.mobile.controller.worker;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.mobile.controller.BaseController;

@Controller
@RequestMapping("/worker")
public class WorkerController extends BaseController{

	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model){
	
		
		return "/worker/list";
	}
}
