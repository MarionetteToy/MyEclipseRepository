package com.yxd.dao;

import com.yxd.po.BlogInfo;

public interface BlogInfoDAO {
	//设置个性化内容
	public void save(BlogInfo info);
	//获得
	public BlogInfo get(String username);
}
