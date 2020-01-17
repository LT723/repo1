package com.sy.dao;

import java.util.List;

import com.sy.bean.Shdmx;

public interface ShdmxDao {
	//查找某订单下未入库货物
	List<Shdmx> queryAllShdmxs(int id) throws Exception;
	//添加记录
	void update(Shdmx shdmx) throws Exception;
	//删除明细
	void delete(int id)throws Exception;
}
