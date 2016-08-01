package com.ymtk.ai.zhxs.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ymtk.ai.utils.BaseController;


@Controller
@RequestMapping("/auth")
public class AuthController extends BaseController{
	
	@Autowired
	private AuthService authService;

	@RequestMapping("list")
	public String list(HttpServletRequest request,HttpServletResponse response){
		
		return "list";		
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String addView(){
		return "";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(){
		return "";
	}
}
