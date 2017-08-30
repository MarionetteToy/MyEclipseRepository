package com.yxd.jiexin.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yxd.jiexin.dao.FactoryDao;
import com.yxd.jiexin.domain.Factory;

@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{
	public FactoryDaoImpl() {
		//设置命名空间，这个命名空间是属于映射文件里面的
		super.setNs("com.yxd.jiexin.mapper.FactoryMapper");
	}

	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState", map);
	}
}
