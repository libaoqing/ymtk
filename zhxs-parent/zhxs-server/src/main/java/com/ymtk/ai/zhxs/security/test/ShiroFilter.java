package com.ymtk.ai.zhxs.security.test;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import com.ymtk.ai.zhxs.security.pojo.Role;
import com.ymtk.ai.zhxs.security.pojo.User;

/**
 * @author libq
 * 
 *      2016-03-22
 */
public class ShiroFilter implements Filter {

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.Filter#destroy()
   */
  @Override
  public void destroy() {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
   */
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    HttpServletResponse httpResponse = (HttpServletResponse) response;
    Principal principal = httpRequest.getUserPrincipal();
    System.out.println("ee");
    if (principal != null) {
      Subject subjects = SecurityUtils.getSubject();
      // 为了简单，这里初始化一个用户。实际项目项目中应该去数据库里通过名字取用户：
      // 例如：User user = userService.getByAccount(principal.getName());
      User user = new User();
      user.setUsername("shiro");
      user.setPassword("123456");
   //   List<Role> roles = new ArrayList<Role>();
      user.setRole(new Role("3"));
      if (user.getUsername().equals(principal.getName())) {
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user
            .getPassword());
        subjects = SecurityUtils.getSubject();
        subjects.login(token);
        subjects.getSession();
      } else {
        // 如果用户为空，则subjects信息登出
        if (subjects != null) {
          subjects.logout();
        }
      }
    }
    chain.doFilter(httpRequest, httpResponse);

  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
   */
  @Override
  public void init(FilterConfig arg0) throws ServletException {
    // TODO Auto-generated method stub

  }

}
