package com.yxd.service.impl;

import java.util.Date;

import com.yxd.dao.DianjiliangDAO;
import com.yxd.po.Dianjiliang;
import com.yxd.service.DianjiliangService;

public class DianjiliangServiceImpl  implements DianjiliangService{
	private DianjiliangDAO dianjiliangDao;

	public DianjiliangDAO getDianjiliangDao() {
		return dianjiliangDao;
	}

	public void setDianjiliangDao(DianjiliangDAO dianjiliangDao) {
		this.dianjiliangDao = dianjiliangDao;
	}

	public boolean isVistor(int AId, String IP, Date time) {
		if(dianjiliangDao.queryByAId(AId, IP, time).size() != 0) {
			System.out.println("��IP����������");
			//��ʾ�û��Ѿ�������ˡ�
			return true;
		} else {
			System.out.println("��IP����û�е����");
			//��ʾ�û�û�е����
			Dianjiliang djl = new Dianjiliang();
			djl.setAId(AId);
			djl.setIp(IP);
			djl.setTime(time);
			//�����¼
			dianjiliangDao.addJilu(djl);
			return false;
		}
	}
	
	
}
