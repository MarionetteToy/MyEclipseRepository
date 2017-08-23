package com.yxd.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yxd.po.User;
import com.yxd.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	public void add(User user) {
		this.getHibernateTemplate().save(user);
	}

	public void delete(com.yxd.po.User user) {

	}

	public List queryAll() {
		return null;
	}

	public User queryByID(String username) {
		List list = this.getHibernateTemplate().find("select user from User user where user.username = '" + username + "'");
		if(list.size() == 0) {
			return null;
		} else {
			return (User)list.get(0);
		}
	}

	public void update(User user) {

	}

}
