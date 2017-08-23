package com.yxd.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.yxd.po.Article;
import com.yxd.service.ArticleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddArticleAction extends ActionSupport {
	private String title;
	private String content;
	private ArticleService articleService;
	
	public com.yxd.service.ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String execute() throws Exception {
		
		//��ȡ������
		Map session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		
		//��װһ��PO��Ķ���
		Article article = new Article();
		article.setTitle(title);
		article.setContent(content);
		article.setUsername(username);
		article.setDate(new Date());
		article.setHasread(0);
		articleService.addArticle(article);
		//���request
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("url", "showUserAllArticleAction.action");
		request.setAttribute("info", "��ӳɹ�");
		return SUCCESS;
	}
}
