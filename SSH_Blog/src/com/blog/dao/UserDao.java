package com.blog.dao;

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
 * @说明 用户持久层接口
 */
public interface UserDao {
	//通过username获取用户对象
	public UserBean getByUsername(String username);
	//保存用户
	public boolean saveUser(UserBean user);
	//博客个性化设置
	public boolean saveBlogInfo(BlogInfoBean blog);
	//写日志
	public boolean saveArticle(ArticleBean article);
	//保存用户图片
	public boolean savePhoto(PhotoBean photo);
	//获取用户图片
	public List<PhotoBean> getPhoto(String username);
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
