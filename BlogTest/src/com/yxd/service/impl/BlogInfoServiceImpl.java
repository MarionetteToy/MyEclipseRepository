package com.yxd.service.impl;

import com.yxd.dao.BlogInfoDAO;
import com.yxd.po.BlogInfo;
import com.yxd.service.BlogInfoService;

public class BlogInfoServiceImpl implements BlogInfoService {
	private BlogInfoDAO blogInfoDao;
	
	
	public BlogInfoDAO getBlogInfoDao() {
		return blogInfoDao;
	}

	public void setBlogInfoDao(BlogInfoDAO blogInfoDao) {
		this.blogInfoDao = blogInfoDao;
	}

	public BlogInfo getBlogInfo(String username) {
		return blogInfoDao.get(username);
	}

	public void setBlogInfo(BlogInfo blogInfo) {
		//ͨ������DAO���������жϣ��ǳ�����ӻ��Ǹ���
		blogInfoDao.save(blogInfo);
	}

}
