package com.blog.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��14��
 *
 * @˵�� �����û��ĵ�¼����Ȩ��
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
