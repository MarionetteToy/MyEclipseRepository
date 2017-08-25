package com.blog.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月14日
 *
 * @说明 拦截用户的登录访问权限
 */
public class UserInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		Object obj = ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		if(obj != null) {
			arg0.invoke();
		}
		return "loginPage";
	}

}
