package com.yxd.dao;

import java.util.List;

import com.yxd.po.Critique;
import com.yxd.po.Page;

public interface CritiqueDAO {
	//�������
	public void addCritique(Critique critique);
	
	//���ָ�����µ�������
	public int queryCritiqueCount(int AId);
	
	//����Page����ѯָ�����µ�����
	public List<Critique> queryByPage(int AId,Page page);
}
