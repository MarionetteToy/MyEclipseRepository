package com.yxd.service;

import com.yxd.po.Critique;
import com.yxd.po.Page;
import com.yxd.po.Result;

public interface CritiqueService {
	//添加评论
	public void addCritique(Critique critique);
	
	//分页显示评论
	public Result showCritiqueByPage(int AId,Page page);
}
