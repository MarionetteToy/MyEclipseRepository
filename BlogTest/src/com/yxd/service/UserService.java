package com.yxd.service;

import com.yxd.po.User;

public interface UserService {
	//�û�ע��
	public boolean registerUser(User user);
	
	//�û���¼
	public boolean loginUser(User user);
}
