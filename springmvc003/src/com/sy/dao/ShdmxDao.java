package com.sy.dao;

import java.util.List;

import com.sy.bean.Shdmx;

public interface ShdmxDao {
	//����ĳ������δ������
	List<Shdmx> queryAllShdmxs(int id) throws Exception;
	//��Ӽ�¼
	void update(Shdmx shdmx) throws Exception;
	//ɾ����ϸ
	void delete(int id)throws Exception;
}
