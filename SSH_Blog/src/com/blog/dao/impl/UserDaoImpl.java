package com.blog.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.blog.dao.UserDao;
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
 * @说明 UserDao接口的实现类，操作数据库信息
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	@SuppressWarnings("unchecked")
	@Override
	public UserBean getByUsername(String username) {
		String hql = "from UserBean where username=?";
		List<UserBean> list = this.getHibernateTemplate().find(hql, username);
		if(list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean saveUser(UserBean user) {
		Integer temp = (Integer) this.getHibernateTemplate().save(user);
		if(temp != null && temp != 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean saveBlogInfo(BlogInfoBean blog) {
		Integer temp = (Integer) this.getHibernateTemplate().save(blog);
		if(temp != null && temp != 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean saveArticle(ArticleBean article) {
		Integer temp = (Integer) this.getHibernateTemplate().save(article);
		if(temp != null && temp != 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PhotoBean> getPhoto(String username) {
		String hql = "from PhotoBean where username=?";
		List<PhotoBean> list =  this.getHibernateTemplate().find(hql, username);
		return list;
	}

	@Override
	public boolean savePhoto(PhotoBean photo) {
		Integer temp = (Integer)this.getHibernateTemplate().save(photo);
		if(temp != null && temp != 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleBean> getUserArticle(String username) {
		String hql = "from ArticleBean where username=?";
		List<ArticleBean> list = this.getHibernateTemplate().find(hql, username);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleBean> getUserPageArticle(String username, int currPage) {
		String hql = "from ArticleBean where username=:username";
		Query query = this.getSession().createQuery(hql);
		query.setParameter("username", username);
		//一页传5条记录
		query.setMaxResults(5);
		query.setFirstResult((currPage-1) * 5);
		return (List<ArticleBean>) query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleBean> getAllArticle() {
		String hql = "from ArticleBean";
		return this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleBean> getAllArticle(int currentPage) {
		String hql = "from ArticleBean";
		Query query = this.getSession().createQuery(hql);
		query.setMaxResults(5);
		query.setFirstResult((currentPage - 1) * 5);
		return query.list();
	}

	@Override
	public ArticleBean getArticle(Integer id) {
		return this.getHibernateTemplate().get(ArticleBean.class, id);
	}

}
