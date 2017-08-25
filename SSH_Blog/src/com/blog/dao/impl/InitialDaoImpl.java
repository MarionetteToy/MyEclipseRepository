package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.dao.InitialDao;
import com.blog.pojo.ArticleBean;

/**
 * 
 * @���� YXD
 *
 * @ʱ�� 2017��3��5��
 *
 * @˵�� InittialDao�ӿ�ʵ����
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
