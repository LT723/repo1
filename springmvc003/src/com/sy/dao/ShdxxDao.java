package com.sy.dao;

import java.util.List;

import com.sy.bean.Shdxx;

public interface ShdxxDao {
	//查询所有收货单
	List<Shdxx> queryAllShdxxs() throws Exception;
	//通过id查询收货单
	Shdxx getShdxxById(int id) throws Exception;
	//修改状态1
	void update1(int id)throws Exception;
	//修改状态2
	void update2(int id)throws Exception;
	//删除收货单
	void delete(int id)throws Exception;
}
