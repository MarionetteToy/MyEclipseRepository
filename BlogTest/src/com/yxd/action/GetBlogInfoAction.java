package com.yxd.action;

import java.util.Map;

import com.yxd.po.BlogInfo;
import com.yxd.service.BlogInfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetBlogInfoAction extends ActionSupport {



	private BlogInfoService blogInfoService;

	public BlogInfoService getBlogInfoService() {
		return blogInfoService;
	}

	public void setBlogInfoService(BlogInfoService blogInfoService) {
		this.blogInfoService = blogInfoService;
	}
	
	public String execute() throws Exception {
		//获得usrname
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		
		//通过业务逻辑组件来查询
		BlogInfo bloginfo  = blogInfoService.getBlogInfo(username);
		
		if(bloginfo != null) {
			session.put("blogtitle", bloginfo.getBlogtitle());
			session.put("idiograph", bloginfo.getIdiograph());
		}
		return this.SUCCESS;
	}
}
