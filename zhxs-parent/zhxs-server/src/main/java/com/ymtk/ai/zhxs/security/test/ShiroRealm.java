package com.ymtk.ai.zhxs.security.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.ymtk.ai.zhxs.entity.YmtkPermission;
import com.ymtk.ai.zhxs.entity.YmtkRole;
import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.manager.PermissionManager;
import com.ymtk.ai.zhxs.manager.UserManager;

public class ShiroRealm extends AuthorizingRealm {
	
	private Logger logger = Logger.getLogger(ShiroRealm.class);
	
	//注入的类，真正的去访问数据库
    private UserManager  usermgr;
    private PermissionManager permgr;
    
    //查询用户的权限信息
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		logger.debug("验证权限！");
		YmtkUser user = (YmtkUser) principals.fromRealm(getName()).iterator().next();
		System.out.println(user.getUserName());
		
		List<YmtkPermission> cper = permgr.getPermission(user);
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		
		if(cper != null && !cper.isEmpty()){
			for(YmtkPermission per: cper){
				info.addStringPermission(per.getPermission());
			}
		}
		
		List<YmtkRole> croles = permgr.getRoles(user);
		
		if(croles != null && !croles.isEmpty()){
			for(YmtkRole role : croles){
				info.addRole(role.getName());
			}
		}		
		
		return info;
	}
    //查询用户的身份信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		
		YmtkUser user= usermgr.getUserByName(token.getPrincipal().toString());
		
		if(user==null){
			throw new UnknownAccountException();
		}else{
			logger.debug("登陆用户："+user.getUserName());
			return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
		}
	}
	
	public UserManager getUsermgr() {
		return usermgr;
	}
	public void setUsermgr(UserManager usermgr) {
		this.usermgr = usermgr;
	}
	public PermissionManager getPermgr() {
		return permgr;
	}
	public void setPermgr(PermissionManager permgr) {
		this.permgr = permgr;
	}
	
	

}