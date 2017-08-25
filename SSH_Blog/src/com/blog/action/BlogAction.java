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
 * @作者 YXD
 *
 * @时间 2017年3月6日
 *
 * @说明 博客设置
 */
public class BlogAction extends ActionSupport implements ModelDriven<BlogInfoBean> {

	private BlogInfoBean blog = new BlogInfoBean();
	@Override
	public BlogInfoBean getModel() {
		return blog;
	}
	
	@Resource(name="userService")
	private UserService userService;

	//编辑博客个性化
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
