package com.sy.service;

import java.util.List;

import com.sy.bean.Shdmx;

public interface ShdmxService {
	//����ĳ������δ������
	List<Shdmx> queryAllShdmxs(int id) throws Exception;
	//��Ӽ�¼
	void add(Shdmx shdmx)throws Exception;
	//ɾ����¼
	void delete(int id)throws Exception;
}
