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
			System.out.println("该IP今天点击过了");
			//表示用户已经点击过了。
			return true;
		} else {
			System.out.println("该IP今天没有点击过");
			//表示用户没有点击过
			Dianjiliang djl = new Dianjiliang();
			djl.setAId(AId);
			djl.setIp(IP);
			djl.setTime(time);
			//保存记录
			dianjiliangDao.addJilu(djl);
			return false;
		}
	}
	
	
}
