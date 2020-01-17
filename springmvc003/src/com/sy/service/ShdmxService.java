package com.sy.service;

import java.util.List;

import com.sy.bean.Shdmx;

public interface ShdmxService {
	//查找某订单下未入库货物
	List<Shdmx> queryAllShdmxs(int id) throws Exception;
	//添加记录
	void add(Shdmx shdmx)throws Exception;
	//删除记录
	void delete(int id)throws Exception;
}
