/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 * @since libq @ 2016年4月3日 上午9:22:58
 *
 */
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController{
	
	@RequestMapping("/index")
	public String commonTask(){
		return "/common/index";
	}
}
