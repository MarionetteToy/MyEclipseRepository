package com.yxd.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.yxd.po.Article;
import com.yxd.po.Page;
import com.yxd.po.Result;
import com.yxd.service.ArticleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAllArticleAction extends ActionSupport{
	private ArticleService articleService;
	
	private int currentPage;

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	public String execute() throws Exception {
		//����Ҫ���session
		Map session = ActionContext.getContext().getSession();
		//���username
		String username = (String) session.get("username");
		//ͨ������ҵ���߼��������ɲ�ѯ
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		
		Result result = articleService.showUserArticleByPage(username, page);
		page = result.getPage();
		List<Article> all = result.getList();
		List critiqueCounts = new ArrayList();
		
		for(Article article : all) {
			//�ҵ�ÿһƪ���¶�Ӧ����������������List������
			critiqueCounts.add(articleService.getCritiqueCount(article.getId()));
		}
		
		//�Ѳ�ѯ���Ľ��������һ����Χ��request
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("critiqueCounts",critiqueCounts);
		return SUCCESS;
	}
	
}
