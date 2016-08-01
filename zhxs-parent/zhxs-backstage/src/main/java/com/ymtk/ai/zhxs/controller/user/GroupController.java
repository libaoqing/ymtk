package com.ymtk.ai.zhxs.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.utils.BaseController;

@Controller
@RequestMapping("group")
public class GroupController extends BaseController{

	public String list(){
		return "list";
	}
}
