package com.yxd.service;

import com.yxd.po.Critique;
import com.yxd.po.Page;
import com.yxd.po.Result;

public interface CritiqueService {
	//�������
	public void addCritique(Critique critique);
	
	//��ҳ��ʾ����
	public Result showCritiqueByPage(int AId,Page page);
}
