/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymtk.ai.zhxs.service.TestService;

/**
 * TODO
 * @since libq @ 2016年3月10日 下午2:35:37
 *
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController{

	@Autowired
	private TestService testService;
	
	@RequestMapping("/list")
	public String list(){
		
		this.testService.query();
		return "main";
	}
	
	@ResponseBody
	@RequestMapping("/body")
	public String getStr(){
		return "2";
	}
}
