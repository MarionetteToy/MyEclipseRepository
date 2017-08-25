package com.blog.service;

import java.util.List;

import com.blog.pojo.ArticleBean;
import com.blog.pojo.BlogInfoBean;
import com.blog.pojo.PhotoBean;
import com.blog.pojo.UserBean;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月4日
 *
 * @说明 用户service层接口
 */
public interface UserService {

	//通过username获取用户对象，TRUE表示可以登录，FALSE表示不能登录
	public boolean getByUsername(String username, String password);
	//保存用户
	public boolean saveUser(UserBean user);
	//博客个性化设置
	public boolean saveBlogInfo(BlogInfoBean blog);
	//写日志
	public boolean saveArticle(ArticleBean article);
	//获取用户图片
	public List<PhotoBean> getPhoto(String username);
	//保存用户图片
	public boolean savePhoto(PhotoBean photo);
	//获取用户所有文章
	public List<ArticleBean> getUserArticle(String username);
	//分页显示数据
	public List<ArticleBean> getUserPageArticle(String username, int currPage);
	//获取所有文章
	public List<ArticleBean> getAllArticle();
	//分页查询帖子
	public List<ArticleBean> getAllArticle(int currentPage);
	//获取文章某一条记录
	public ArticleBean getArticle(Integer id);
}
