package com.yxd.service;

import com.yxd.po.BlogInfo;

public interface BlogInfoService {
	//���ò��͸��Ի�����
	public void setBlogInfo(BlogInfo blogInfo);
	
	//��ò��͸��Ի�����
	public BlogInfo getBlogInfo(String username);
}
