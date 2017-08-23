package com.yxd.service.impl;

import java.util.List;

import com.yxd.dao.CritiqueDAO;
import com.yxd.po.Critique;
import com.yxd.po.Page;
import com.yxd.po.Result;
import com.yxd.service.CritiqueService;
import com.yxd.utils.PageUtil;

public class CritiqueServiceImpl implements CritiqueService {
	private CritiqueDAO critiqueDao;

	public CritiqueDAO getCritiqueDao() {
		return critiqueDao;
	}

	public void setCritiqueDao(CritiqueDAO critiqueDao) {
		this.critiqueDao = critiqueDao;
	}

	public void addCritique(Critique critique) {
		critiqueDao.addCritique(critique);
	}
	
	public Result showCritiqueByPage(int AId, Page page) {
		page = PageUtil.createPage(page,critiqueDao.queryCritiqueCount(AId));
		List<Critique> all = critiqueDao.queryByPage(AId, page);
		Result result = new Result();
		result.setPage(page);
		result.setList(all);
		return result;
	}
}
