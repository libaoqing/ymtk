package com.ymtk.ai.zhxs.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

	@RequestMapping(value = "/dologin")  
	public String doLogin(HttpServletRequest request, Model model) {  
	    String msg = "";  
	    String userName = request.getParameter("username");  
	    String password = request.getParameter("password");  
	    System.out.println(userName);  
	    System.out.println(password);  
	    UsernamePasswordToken token = new UsernamePasswordToken(userName, password);  
	    token.setRememberMe(true);  
	    Subject subject = SecurityUtils.getSubject();  
	    try {  
	        subject.login(token);
	        if (subject.isAuthenticated()) {
	        	
	            return "redirect:/task/project";  
	        } else {	        	
	            return "login/login";  
	        }  
	    } catch (IncorrectCredentialsException e) {  
	        msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (ExcessiveAttemptsException e) {  
	        msg = "登录失败次数过多";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (LockedAccountException e) {  
	        msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (DisabledAccountException e) {  
	        msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (ExpiredCredentialsException e) {  
	        msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (UnknownAccountException e) {  
	        msg = "帐号不存在. There is no user with username of " + token.getPrincipal();  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    } catch (UnauthorizedException e) {  
	        msg = "您没有得到相应的授权！" + e.getMessage();  
	        model.addAttribute("message", msg);  
	        System.out.println(msg);  
	    }  
	    return "login/login";  
	}
	
	@RequestMapping(value = "/login")  
	public String Login(HttpServletRequest request, Model model) { 
		model.addAttribute("message", "你好，在访问信息没有权限或不存在！");
		return "login/login";
	}
	
	@RequestMapping(value="/logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
			if (logger.isDebugEnabled()) {
				logger.debug("用户"  + "退出登录");
			}
		}
		return "login/login";
	}
}
