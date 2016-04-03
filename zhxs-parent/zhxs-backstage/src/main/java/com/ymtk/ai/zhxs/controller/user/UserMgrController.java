/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.zhxs.controller.BaseController;
import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.query.BaseUserQuery;
import com.ymtk.ai.zhxs.service.UserMgrService;

/**
 * TODO
 * @since libq @ 2016年4月3日 下午7:42:08
 *
 */
@Controller
@RequestMapping("/manager/user")
public class UserMgrController extends BaseController{
	
	@Autowired
	private UserMgrService userMgrService;

	@RequestMapping(value = "/list")  
	public String Login(HttpServletRequest request,HttpServletResponse response, Model model) { 
		
		BaseUserQuery uq = new BaseUserQuery();
		
		List<YmtkUser> result = this.userMgrService.queryUsers(uq);
		
		model.addAttribute("result", result);
		return "user/list";
	}
}
