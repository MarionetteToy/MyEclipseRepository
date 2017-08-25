package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.dao.InitialDao;
import com.blog.pojo.ArticleBean;

/**
 * 
 * @作者 YXD
 *
 * @时间 2017年3月5日
 *
 * @说明 InittialDao接口实现类
 */
@SuppressWarnings("unchecked")
public class InitialDaoImpl extends HibernateDaoSupport implements InitialDao<ArticleBean> {

	@Override
	public List<ArticleBean> getAllArticle(int currentPage) {
		String hql = "from ArticleBean";
		Query query = this.getSession().createQuery(hql);
		query.setMaxResults(5);
		query.setFirstResult((currentPage - 1) * 5);
		return query.list();
	}
}
