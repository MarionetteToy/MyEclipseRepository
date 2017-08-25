package com.blog.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.blog.pojo.ArticleBean;
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
 * @˵�� ��־
 */
@SuppressWarnings("serial")
public class ArticleAction extends ActionSupport implements ModelDriven<ArticleBean> {
	
	private ArticleBean article = new ArticleBean();
	@Override
	public ArticleBean getModel() {
		return article;
	}
	@Resource(name="userService")
	private UserService userService;

	public String addArticle() {
		//����
		article.setDate(new Date());
		article.setHasread(1);
		UserBean user = (UserBean) ServletActionContext.getRequest().getSession().getAttribute("loginUser");
		if(user != null) {
			article.setUsername(user.getUsername());
			userService.saveArticle(article);
			return "addArticle";
		}
		return NONE;
	}
}
