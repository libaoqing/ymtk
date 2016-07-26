package com.ymtk.ai.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymtk.ai.utils.BaseController;

@Controller
@RequestMapping("/test")
public class TestController extends BaseController{

	@ResponseBody
	@RequestMapping("list")
	public String list(){
		return "libq";
	}
}
