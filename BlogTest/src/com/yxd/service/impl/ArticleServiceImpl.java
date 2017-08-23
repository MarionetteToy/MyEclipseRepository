package com.yxd.service.impl;

import java.util.List;

import com.yxd.dao.ArticleDAO;
import com.yxd.dao.CritiqueDAO;
import com.yxd.po.Article;
import com.yxd.po.Page;
import com.yxd.po.Result;
import com.yxd.service.ArticleService;
import com.yxd.utils.PageUtil;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDAO articleDao;
	private CritiqueDAO critiqueDao;
	
	public CritiqueDAO getCritiqueDao() {
		return critiqueDao;
	}

	public void setCritiqueDao(CritiqueDAO critiqueDao) {
		this.critiqueDao = critiqueDao;
	}

	public ArticleDAO getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}



	public void addArticle(Article article) {
		articleDao.add(article);
	}

	@Override
	public List<Article> showUserAllArticle(String username) {
		return articleDao.queryUserAll(username);
	}
	
	public Result showUserArticleByPage(String username, Page page) {
		page = PageUtil.createPage(page,articleDao.queryUserAllCount(username));
		List<Article> all = articleDao.queryByPage(username, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}
	
	public Result showArticleByPage(Page page) {
		page = PageUtil.createPage(page,articleDao.queryAllCount());
		List<Article> all = articleDao.queryAllByPage(page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}
	
	public Article showArticle(int id) {
		return articleDao.queryById(id);
	}

	public int getCritiqueCount(int AId) {
		return critiqueDao.queryCritiqueCount(AId);
	}

}
