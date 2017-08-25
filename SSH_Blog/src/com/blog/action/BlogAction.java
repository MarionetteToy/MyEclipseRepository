package com.blog.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.blog.pojo.BlogInfoBean;
import com.blog.pojo.UserBean;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��6��
 *
 * @˵�� ��������
 */
public class BlogAction extends ActionSupport implements ModelDriven<BlogInfoBean> {

	private BlogInfoBean blog = new BlogInfoBean();
	@Override
	public BlogInfoBean getModel() {
		return blog;
	}
	
	@Resource(name="userService")
	private UserService userService;

	//�༭���͸��Ի�
	public String editBlogInfo() {
		UserBean user = (UserBean) ServletActionContext.getRequest().getSession().
				getAttribute("loginUser");
		if(user != null) {
			blog.setUsername(user.getUsername());
			userService.saveBlogInfo(blog);
			return "editBlogInfo";
		}
		return NONE;
	}
}
