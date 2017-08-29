package com.yxd.jiexin.dao;

import java.util.Map;

import com.yxd.jiexin.domain.Factory;

public interface FactoryDao extends BaseDao<Factory> {
	public void updateState(Map map);			//修改状态
}
