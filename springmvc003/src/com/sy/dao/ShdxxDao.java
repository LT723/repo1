package com.sy.dao;

import java.util.List;

import com.sy.bean.Shdxx;

public interface ShdxxDao {
	//��ѯ�����ջ���
	List<Shdxx> queryAllShdxxs() throws Exception;
	//ͨ��id��ѯ�ջ���
	Shdxx getShdxxById(int id) throws Exception;
	//�޸�״̬1
	void update1(int id)throws Exception;
	//�޸�״̬2
	void update2(int id)throws Exception;
	//ɾ���ջ���
	void delete(int id)throws Exception;
}
