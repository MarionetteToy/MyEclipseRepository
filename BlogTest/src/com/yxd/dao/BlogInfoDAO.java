package com.yxd.dao;

import com.yxd.po.BlogInfo;

public interface BlogInfoDAO {
	//���ø��Ի�����
	public void save(BlogInfo info);
	//���
	public BlogInfo get(String username);
}
