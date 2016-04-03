/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller.common;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ymtk.ai.zhxs.controller.BaseController;

/**
 * TODO
 * @since libq @ 2016年4月3日 上午9:22:58
 *
 */
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController{
	
	@RequestMapping("/task")
	public String commonTask(){
		return "/common/task";
	}
}
