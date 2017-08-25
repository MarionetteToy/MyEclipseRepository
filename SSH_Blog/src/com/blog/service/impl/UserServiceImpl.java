package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.blog.dao.UserDao;
import com.blog.pojo.ArticleBean;
import com.blog.pojo.BlogInfoBean;
import com.blog.pojo.PhotoBean;
import com.blog.pojo.UserBean;
import com.blog.service.UserService;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月4日
 *
 * @说明 userService的实现类，用于业务判断
 */
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userDao;

	@Override
	public boolean getByUsername(String username, String password) {
		UserBean user = userDao.getByUsername(username);
		if(user != null && !"".equals(password) && password.equals(user.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean saveUser(UserBean user) {
		return userDao.saveUser(user);
	}

	@Override
	public boolean saveBlogInfo(BlogInfoBean blog) {
		return userDao.saveBlogInfo(blog);
	}

	@Override
	public boolean saveArticle(ArticleBean article) {
		return userDao.saveArticle(article);
	}

	@Override
	public List<PhotoBean> getPhoto(String username) {
		return userDao.getPhoto(username);
	}

	@Override
	public boolean savePhoto(PhotoBean photo) {
		return userDao.savePhoto(photo);
	}

	@Override
	public List<ArticleBean> getUserArticle(String username) {
		return userDao.getUserArticle(username);
	}

	@Override
	public List<ArticleBean> getUserPageArticle(String username, int currPage) {
		return userDao.getUserPageArticle(username, currPage);
	}

	@Override
	public List<ArticleBean> getAllArticle() {
		return userDao.getAllArticle();
	}

	@Override
	public List<ArticleBean> getAllArticle(int currentPage) {
		return userDao.getAllArticle(currentPage);
	}

	@Override
	public ArticleBean getArticle(Integer id) {
		return userDao.getArticle(id);
	}

}
