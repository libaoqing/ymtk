/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.service.resource.ResourceService;

/**
 * TODO
 * @since libq @ 2016年4月3日 上午9:22:58
 *
 */
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController{
	
	@Autowired
	private ResourceService resourceService;
	
	@RequestMapping("/index")
	public String commonTask(HttpServletRequest request, Model model){
		
		YmtkUser user = (YmtkUser) SecurityUtils.getSubject().getPrincipal();
		
		this.resourceService.queryResources();
		
		return "/common/index";
	}
}
