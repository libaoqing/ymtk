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
import com.ymtk.ai.zhxs.entity.YmtkRole;
import com.ymtk.ai.zhxs.query.BaseUserQuery;
import com.ymtk.ai.zhxs.service.RoleMgrService;

/**
 * TODO
 * @since libq @ 2016年4月3日 下午7:42:08
 *
 */
@Controller
@RequestMapping("/manager/role")
public class RoleMgrController extends BaseController{
	
	@Autowired
	private RoleMgrService roleMgrService;

	@RequestMapping(value = "/list")  
	public String Login(HttpServletRequest request,HttpServletResponse response, Model model) { 
		
		BaseUserQuery uq = new BaseUserQuery();
		
		List<YmtkRole> result = this.roleMgrService.queryRoles(uq);
		
		model.addAttribute("result", result);
		return "role/list";
	}
}
