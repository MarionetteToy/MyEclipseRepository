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
		//首先要获得session
		Map session = ActionContext.getContext().getSession();
		//获得username
		String username = (String) session.get("username");
		//通过调用业务逻辑组件来完成查询
		Page page = new Page();
		page.setCurrentPage(this.getCurrentPage());
		page.setEveryPage(5);
		
		Result result = articleService.showUserArticleByPage(username, page);
		page = result.getPage();
		List<Article> all = result.getList();
		List critiqueCounts = new ArrayList();
		
		for(Article article : all) {
			//找到每一篇文章对应的评论数，并放入List集合中
			critiqueCounts.add(articleService.getCritiqueCount(article.getId()));
		}
		
		//把查询到的结果保存在一个范围，request
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		request.setAttribute("critiqueCounts",critiqueCounts);
		return SUCCESS;
	}
	
}
