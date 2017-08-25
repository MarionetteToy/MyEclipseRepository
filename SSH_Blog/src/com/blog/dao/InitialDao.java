package com.blog.dao;

import java.util.List;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月5日
 *
 * @说明 Tomcat服务器启动就需要加载的数据
 */
public interface InitialDao<T> {
	
	//查询所有帖子
	public List<T> getAllArticle(int currentPage);
}
