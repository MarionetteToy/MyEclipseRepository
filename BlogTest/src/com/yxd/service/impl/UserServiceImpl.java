package com.yxd.service.impl;

import com.yxd.dao.UserDAO;
import com.yxd.po.User;
import com.yxd.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userDao;
	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public boolean registerUser(User user) {
		//判断用户是否存在
		if(userDao.queryByID(user.getUsername()) != null) {
			return false;
		}else {
			userDao.add(user);
			return true;
		}
	}

	public boolean loginUser(User user) {
		//判断用户是否存在
		if(userDao.queryByID(user.getUsername()) == null) {
			return false;
		} else {
			User queryUser = userDao.queryByID(user.getUsername());
			if(queryUser.getPassword().equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
}
